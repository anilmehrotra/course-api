package io.brain.track.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    
    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getAllTopics();
    }
    
    //@RequestParam(value = "uniqueId", defaultValue="A1"
    @RequestMapping("/topics/{uniqueId}")
    public Topic getTopic(@PathVariable("uniqueId") String id){
        return topicService.getTopic(id);
    }
    
    //@RequestMapping(method = RequestMethod.POST, value = "/topics")
    @PostMapping("/topics")
    public List<Topic> addTopic(@RequestBody Topic topic){
        return topicService.addTopic(topic);
    }
    
    @PutMapping("/topics/{uniqueId}")
    public List<Topic> updateTopic(@RequestBody Topic topic,@PathVariable("uniqueId")String id){
        return topicService.updateTopic(topic);
    }
    
    @DeleteMapping("/topics/{uniqueId}")
    public List<Topic> deleteTopic(@PathVariable("uniqueId")String id){
        return topicService.updateTopic(id);
    }
}
