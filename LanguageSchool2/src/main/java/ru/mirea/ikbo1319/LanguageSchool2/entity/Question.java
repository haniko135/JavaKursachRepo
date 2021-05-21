package ru.mirea.ikbo1319.LanguageSchool2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// добавить lombok

@Entity(name="question")
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    @Column(length = 65535)
    private String answer;

    public Question() {
    }

}
