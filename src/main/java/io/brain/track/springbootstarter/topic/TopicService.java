package io.brain.track.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    List<Topic> topicsList  = new ArrayList<Topic>(Arrays.asList(new Topic("Spring","A1"),
            new Topic("EJB","A2"),
            new Topic("Struts","A3"),
            new Topic("Play","A4")));

    public List<Topic> getAllTopics(){
        return topicsList;
    }

    public Topic getTopic(String id){
        return topicsList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public List<Topic> addTopic(Topic topic) {
        topicsList.add(topic);
        return topicsList;
    }

    public List<Topic> updateTopic(Topic topic) {
        
        for(int i=0; i<topicsList.size(); i++){
            if(topic.getId().equals(topicsList.get(i).getId())){
                topicsList.set(i, topic);
                break;
            }
        }
        return topicsList;
    }

    public List<Topic> updateTopic(String id) {
        topicsList.removeIf(t -> t.getId().equals(id));
        return topicsList;
    }
}
