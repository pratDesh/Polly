package com.prat.polly.model.poll;

import javax.persistence.Id;

public class Choice {

    @Id
    int id;
    String label;
    int votes;

    public Choice() {
    }

    public Choice(int id, String label, int votes) {
        this.id = id;
        this.label = label;
        this.votes = votes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
