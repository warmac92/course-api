package com.mayuresh.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayuresh.model.Topic;
import com.mayuresh.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository; 
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public void addTopic(Topic topic){		
		topicRepository.save(topic);
	}
	
	public Topic getTopic(String id){
		return topicRepository.findOne(id);
	} 
	
	public void updateTopic(String id, Topic topic){
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id){
		topicRepository.delete(id);
	}

}
