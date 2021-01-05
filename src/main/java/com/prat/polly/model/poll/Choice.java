package com.prat.polly.model.poll;

import javax.persistence.Id;

public class Choice {

    @Id
    private int id;
    private String label;
    private Long votes;

    public Choice() {
    }

    public Choice(int id, String label, Long votes) {
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

    public Long getVotes() {
        return votes;
    }

    public void setVotes(Long votes) {
        this.votes = votes;
    }
}
