package ru.mirea.ikbo1319.LanguageSchool2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// добавить lombok

@Entity(name="Language")
@Getter
@Setter
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String image;

    private String imageTest;

    @Column(length = 65535)
    private String description;

    @Column(length = 65535)
    private String largeDescription;

    private String pluses1;
    private String pluses2;
    private String pluses3;
    private String pluses4;

    private String name_title;

    private String testName;

    private String testLink;

    public Language() {
    }

}
