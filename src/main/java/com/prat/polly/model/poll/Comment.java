package com.prat.polly.model.poll;

import java.util.List;

public class Comment {
    String comment;
    List<Comment> replies;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Comment> getReplies() {
        return replies;
    }

    public void setReplies(List<Comment> replies) {
        this.replies = replies;
    }
}
