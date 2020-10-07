package com.prat.polly.model.poll;

public class Reacts {

    int upVotes;
    int downVotes;

    public Reacts() {
    }

    public Reacts(int upVotes, int downVotes) {
        this.upVotes = upVotes;
        this.downVotes = downVotes;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }
}
