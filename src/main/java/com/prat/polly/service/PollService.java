package com.prat.polly.service;

import com.prat.polly.model.poll.Polly01;

import java.util.List;

public interface PollService {


    /**
     * Fetch all available Polls
     *
     */
    List<Polly01> getAll();

    /**
     * Vote for a poll
     *
     * @Param PollId
     * @Param choiceId
     *
     * @return Poll
     */
    Polly01 vote();
}
