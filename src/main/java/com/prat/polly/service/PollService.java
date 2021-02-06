package com.prat.polly.service;

import com.prat.polly.dto.PollDTO;
import com.prat.polly.model.poll.Polly01;
import com.prat.polly.security.UserPrincipal;

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
    Polly01 vote(String pollId, int choiceId, UserPrincipal currentUser);

    Polly01 createPoll(PollDTO dto, UserPrincipal currentUser);
}
