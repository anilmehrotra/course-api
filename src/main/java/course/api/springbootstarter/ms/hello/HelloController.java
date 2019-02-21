package course.api.springbootstarter.ms.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

  /*@Value("${endpoint.service}")
  private String url;

  @Autowired
  Environment env;*/

  @RequestMapping("/hello")
  public String sayHello() {
    return "hi";
  }

  @RequestMapping("/testmicroservice")
  public String getHello() {
    RestTemplate restTemplate = new RestTemplate();
    String uri = "http://127.0.0.1:8080/hello";//url;
    //String uri = env.getProperty("endpoint.service");
    String responseString = restTemplate.getForObject(uri, String.class);
    return responseString + " Calling Another Microservices";
  }
}
