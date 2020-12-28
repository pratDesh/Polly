package com.prat.polly.controller;

import com.prat.polly.dto.PollDTO;
import com.prat.polly.model.poll.Polly01;
import com.prat.polly.service.PollService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/poll")
public class PollController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PollController.class);

    @Autowired
    PollService pollService;

    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    public String healthCheck() {
        return "Polly Working!!";
    }

    @GetMapping
    public List<Polly01> getPolls() {
        //TODO : Fetch a limited Polls at a time.
        LOGGER.info("Getting all polls");
        return pollService.getAll();
    }

    @PutMapping(value = "/vote/{id}/{choice}")
    public Polly01 vote(@PathVariable String id, @PathVariable int choice) {
        return pollService.vote(id,choice);
    }

    @PostMapping(value = "/new")
    public Polly01 create(@RequestBody PollDTO dto) {
        return pollService.createPoll(dto);
    }

}
