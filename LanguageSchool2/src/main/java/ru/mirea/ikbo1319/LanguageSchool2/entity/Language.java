package ru.mirea.ikbo1319.LanguageSchool2.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;


@Entity(name="Language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String image;

    @Column(length = 65535)
    @Type(type = "text")
    private String description;

    private String buttonTest;

    private String buttonDesc;

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

    public String getButtonDesc() {
        return buttonDesc;
    }

    public void setButtonDesc(String buttonDesc) {
        this.buttonDesc = buttonDesc;
    }
}