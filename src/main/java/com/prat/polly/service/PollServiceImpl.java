package com.prat.polly.service;

import com.prat.polly.model.poll.Choice;
import com.prat.polly.model.poll.Polly01;
import com.prat.polly.repository.PollRepository;

import org.apache.tomcat.jni.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PollServiceImpl implements PollService {

    @Autowired
    PollRepository pollRepository;

    @Override
    public List<Polly01> getAll() {
        return pollRepository.findAll();
    }

    @Override
    public Polly01 vote(String pollId, int choiceId) {
        Polly01 polly = pollRepository.findById(pollId).orElse(null);
        polly.getChoices().stream().filter(c -> c.getId() == choiceId).forEach(c -> c.setVotes(c.getVotes() + 1));
        polly.setTotalVotes(polly.getTotalVotes() + 1);
        return pollRepository.save(polly);
    }

    // TODO
    @Override
    public Polly01 createPoll() {
        return null;
    }
}
