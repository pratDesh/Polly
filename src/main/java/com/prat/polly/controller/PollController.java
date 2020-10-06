package com.prat.polly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/poll")
public class PollController {

    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    public String healthCheck() {
        return "Polly Working!!";
    }

    @GetMapping
    public String getPolls() {

        return "All polls";
    }

    @PutMapping
    public String vote() {

        return "Vote for a poll";
    }

}
