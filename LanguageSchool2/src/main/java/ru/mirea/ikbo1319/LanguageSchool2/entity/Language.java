package ru.mirea.ikbo1319.LanguageSchool2.entity;

import javax.persistence.*;

// добавить lombok

@Entity(name="Language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String image;

    @Column(length = 65535)
    private String description;

    @Column(length = 65535)
    private String largeDescription;

    private String pluses1;
    private String pluses2;
    private String pluses3;
    private String pluses4;

    private String name_title;

    private String buttonTest;

    private String testName;

    public Language() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getButtonTest() {
        return buttonTest;
    }

    public void setButtonTest(String buttonTest) {
        this.buttonTest = buttonTest;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getName_title() { return name_title; }

    public String getLargeDescription() { return largeDescription; }

    public void setLargeDescription(String largeDescription) { this.largeDescription = largeDescription; }

    public void setName_title(String name_title) {
        this.name_title = name_title;
    }

    public String getPluses1() {
        return pluses1;
    }

    public void setPluses1(String pluses1) {
        this.pluses1 = pluses1;
    }

    public String getPluses2() {
        return pluses2;
    }

    public void setPluses2(String pluses2) {
        this.pluses2 = pluses2;
    }

    public String getPluses3() {
        return pluses3;
    }

    public void setPluses3(String pluses3) {
        this.pluses3 = pluses3;
    }

    public String getPluses4() {
        return pluses4;
    }

    public void setPluses4(String pluses4) {
        this.pluses4 = pluses4;
    }
}
