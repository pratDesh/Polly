package com.prat.polly.service;

import com.prat.polly.model.poll.Polly01;
import com.prat.polly.repository.PollRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollServiceImpl implements PollService {

    @Autowired
    PollRepository pollRepository;

    @Override
    public List<Polly01> getAll() {
        return pollRepository.findAll();
    }

    @Override
    public Polly01 vote() {
        return null;
    }
}
