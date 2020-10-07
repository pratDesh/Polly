package com.prat.polly.model.poll;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import javax.persistence.Id;

@Document(collection = "polly01")
public class Polly01 {

    @Id
    private String id;
    private String question;
    private List<Choice> choices;

    public Polly01() {
    }

    public Polly01(String id, String question, List<Choice> choices) {
        this.id = id;
        this.question = question;
        this.choices = choices;
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
}
