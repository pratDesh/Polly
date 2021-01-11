package com.prat.polly.model.poll;

import com.prat.polly.model.user.UserSummary;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import javax.persistence.Id;

@Document(collection = "polly01")
public class Polly01 {

    //TODO: Generate custom Ids
    @Id
    private String id;
    //TODO : Add createdTime.

    private UserSummary createdBy;
    private String question;
    private List<Choice> choices;
    private int totalVotes;
    //private Reacts reacts;

    public Polly01() {
    }

    public Polly01(String id, UserSummary createdBy, String question, List<Choice> choices, int totalVotes) {
        this.id = id;
        this.createdBy = createdBy;
        this.question = question;
        this.choices = choices;
        this.totalVotes = totalVotes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public UserSummary getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserSummary createdBy) {
        this.createdBy = createdBy;
    }
}
