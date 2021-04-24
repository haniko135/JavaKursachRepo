package ru.mirea.ikbo1319.LanguageSchool2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.mirea.ikbo1319.LanguageSchool2.entity.Language;
import ru.mirea.ikbo1319.LanguageSchool2.entity.Question;
import ru.mirea.ikbo1319.LanguageSchool2.repository.LanguageRepo;
import ru.mirea.ikbo1319.LanguageSchool2.repository.QuestionRepo;

@Controller
public class TestController {

    @Autowired
    LanguageRepo languageRepo;

    @Autowired
    QuestionRepo questionRepo;

    @GetMapping("/")
    public String index(Model model){
        Iterable<Language> types = languageRepo.findAll();
        model.addAttribute("types", types);
        return "index";
    }

    @GetMapping("courses.html")
    public String courses(Model model){
        Iterable<Language> types = languageRepo.findAll();
        model.addAttribute("types", types);
        return "courses";
    }

    @GetMapping("asks.html")
    public String asks(Model model){
        Iterable<Question> types = questionRepo.findAll();
        model.addAttribute("types", types);
        return "asks";
    }

    @GetMapping("contacts.html")
    public String contacts(Model model){
        return "contacts";
    }
}
