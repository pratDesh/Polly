package com.prat.polly.repository;

import com.prat.polly.model.poll.Polly01;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PollRepository extends MongoRepository<Polly01, String> {

}
