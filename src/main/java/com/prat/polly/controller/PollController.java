package com.prat.polly.controller;

import com.prat.polly.model.poll.Polly01;
import com.prat.polly.service.PollService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/poll")
public class PollController {

    @Autowired
    PollService pollService;

    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    public String healthCheck() {
        return "Polly Working!!";
    }

    @GetMapping
    public List<Polly01> getPolls() {
        return pollService.getAll();
    }

    @PutMapping(value = "/vote/{id}/{choice}")
    public Polly01 vote(@PathVariable String id, @PathVariable int choice) {
        return pollService.vote(id,choice);
    }

    @PostMapping(value = "/new")
    public void create(){
        //TODO
    }

}
