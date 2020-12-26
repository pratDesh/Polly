package com.prat.polly.dto;

import com.prat.polly.model.poll.Choice;

import java.util.List;

public class PollDTO {
    private String question;
    private List<ChoiceDTO> choices;
    private int totalVotes;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<ChoiceDTO> getChoices() {
        return choices;
    }

    public void setChoices(List<ChoiceDTO> choices) {
        this.choices = choices;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }
}
