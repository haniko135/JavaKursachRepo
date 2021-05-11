package ru.mirea.ikbo1319.LanguageSchool2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.mirea.ikbo1319.LanguageSchool2.entity.Language;
import ru.mirea.ikbo1319.LanguageSchool2.entity.Question;
import ru.mirea.ikbo1319.LanguageSchool2.repository.LanguageRepo;
import ru.mirea.ikbo1319.LanguageSchool2.repository.QuestionRepo;

import java.security.Principal;
import java.util.Optional;

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

    //@GetMapping("/{button_desc}")
    //public String getDesc(Model model){
        //Iterable<Language> types = languageRepo.findAll();
        //model.addAttribute("types", types);
        //return "";
    //}
}
