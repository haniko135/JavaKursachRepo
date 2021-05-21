package ru.mirea.ikbo1319.LanguageSchool2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.mirea.ikbo1319.LanguageSchool2.entity.Language;
import ru.mirea.ikbo1319.LanguageSchool2.entity.Question;
import ru.mirea.ikbo1319.LanguageSchool2.repository.LanguageRepo;
import ru.mirea.ikbo1319.LanguageSchool2.repository.QuestionRepo;

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

    @GetMapping("desc")
    public String getDesc(@RequestParam("id") Long id ,Model model, Model desc){
        Optional<Language> lang = languageRepo.findById(id);
        Iterable<Language> types = languageRepo.findAll();
        desc.addAttribute("lang", lang);
        model.addAttribute("types", types);
        return "desc";
    }


    @GetMapping("test_begin")
    public String getTestBegin(@RequestParam("id") Long id ,Model model, Model test){
        Optional<Language> lang = languageRepo.findById(id);
        test.addAttribute("lang", lang);
        return "test_begin";
    }

    @GetMapping("test_page")
    public String getTestPage(@RequestParam("id") Long id ,Model model, Model test){
        Optional<Language> lang = languageRepo.findById(id);
        test.addAttribute("lang", lang);
        return "test_page";
    }
}
