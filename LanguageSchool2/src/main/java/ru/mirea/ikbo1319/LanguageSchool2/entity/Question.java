package ru.mirea.ikbo1319.LanguageSchool2.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name="question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Type(type = "text")
    private String question;

    @Column(length = 65535)
    @Type(type = "text")
    private String answer;

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
