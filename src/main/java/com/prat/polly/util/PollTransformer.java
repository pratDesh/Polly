package com.prat.polly.util;

import com.prat.polly.dto.ChoiceDTO;
import com.prat.polly.dto.PollDTO;
import com.prat.polly.model.poll.Choice;
import com.prat.polly.model.poll.Polly01;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PollTransformer {

    public Polly01 toEntity(PollDTO dto) {
        Polly01 poll = new Polly01();

        poll.setQuestion(dto.getQuestion());
        poll.setTotalVotes(dto.getTotalVotes());
        poll.setChoices(toEntities(dto.getChoices()));

        return poll;
    }

    public List<Choice> toEntities(List<ChoiceDTO> dtos) {
        List<Choice> choices = new ArrayList<>();

        for (ChoiceDTO dto : dtos) {
            Choice choice = toEntity(dto);
            choices.add(choice);
        }

        return choices;
    }

    public Choice toEntity(ChoiceDTO dto) {
        Choice choice = new Choice();

        choice.setLabel(dto.getLabel());
        choice.setVotes(dto.getVotes());
        choice.setId(dto.getId());

        return choice;
    }
}
