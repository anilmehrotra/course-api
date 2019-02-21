package course.api.springbootstarter.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CourseApiApp {

    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class, args);
    }
}
