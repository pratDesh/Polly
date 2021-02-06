package com.prat.polly.service;

import com.prat.polly.dto.PollDTO;
import com.prat.polly.model.poll.Choice;
import com.prat.polly.model.poll.Polly01;
import com.prat.polly.model.user.User;
import com.prat.polly.model.user.UserSummary;
import com.prat.polly.repository.PollRepository;
import com.prat.polly.security.UserPrincipal;
import com.prat.polly.util.PollTransformer;

import org.apache.tomcat.jni.Poll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PollServiceImpl implements PollService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PollServiceImpl.class);

    @Autowired
    PollRepository pollRepository;

    @Autowired
    PollTransformer transformer;

    @Override
    public List<Polly01> getAll() {
        LOGGER.info("Getting all Polls from serviceImpl");
        return pollRepository.findAll();
    }

    @Override
    public Polly01 vote(String pollId, int choiceId, UserPrincipal currentUser) {
        LOGGER.info("Voting for ChoiceId {} for PollId {}", choiceId, pollId);
        Polly01 polly = pollRepository.findById(pollId).orElse(null);
        polly.getChoices().stream().filter(c -> c.getId() == choiceId).forEach(c -> c.setVotes(c.getVotes() + 1));
        polly.setTotalVotes(polly.getTotalVotes() + 1);
        return pollRepository.save(polly);
    }

    // TODO
    @Override
    public Polly01 createPoll(PollDTO dto, UserPrincipal currentUser) {
        LOGGER.info("Creating new Poll: {}", dto);
        Polly01 poll = transformer.toEntity(dto);
        poll.setCreatedBy(getUser());
        return pollRepository.save(poll);
    }

    private UserSummary getUser() {
        UserPrincipal currentUser = (UserPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return new UserSummary(
                currentUser.getId(),
                currentUser.getName(),
                currentUser.getUsername()
        );
    }

}
