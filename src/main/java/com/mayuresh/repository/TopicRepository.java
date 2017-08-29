package com.mayuresh.repository;

import org.springframework.data.repository.CrudRepository;

import com.mayuresh.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
