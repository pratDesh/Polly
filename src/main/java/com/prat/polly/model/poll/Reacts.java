package com.prat.polly.model.poll;

import java.util.List;

public class Reacts {
    private Long likes;
    private List<String> likedBy;

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public List<String> getLikedBy() {
        return likedBy;
    }

    public void setLikedBy(List<String> likedBy) {
        this.likedBy = likedBy;
    }
}
