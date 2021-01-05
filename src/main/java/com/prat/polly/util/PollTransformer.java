package com.prat.polly.util;

import com.prat.polly.dto.PollDTO;
import com.prat.polly.model.poll.Choice;
import com.prat.polly.model.poll.Polly01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PollTransformer {

    @Autowired
    private IdGenerator idGenerator;

    public Polly01 toEntity(PollDTO dto) {
        Polly01 poll = new Polly01();
        poll.setId(idGenerator.getPollId());
        poll.setQuestion(dto.getQuestion());
        poll.setChoices(toEntities(dto.getChoices()));
        poll.setTotalVotes(ApplicationConstants.INITIAL_TOTAL_VOTES);

        return poll;
    }

    public List<Choice> toEntities(List<String> choiceList) {
        List<Choice> choices = new ArrayList<>();
        for (String label : choiceList) {
            Choice choice = new Choice(choiceList.indexOf(label) + 1, label, ApplicationConstants.INITIAL_VOTES);
            choices.add(choice);
        }
        return choices;
    }

}
