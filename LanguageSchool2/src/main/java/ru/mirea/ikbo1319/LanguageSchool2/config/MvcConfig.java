package ru.mirea.ikbo1319.LanguageSchool2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("contacts.html").setViewName("contacts");
        registry.addViewController("login.html").setViewName("login");
        registry.addViewController("desc/ukraine_desc.html").setViewName("desc/ukraine_desc");
        registry.addViewController("desc/russia_desc.html").setViewName("desc/russia_desc");
        registry.addViewController("desc/england_desc.html").setViewName("desc/england_desc");
        registry.addViewController("desc/germany_desc.html").setViewName("desc/germany_desc");
        registry.addViewController("test/ukraine_test_begin.html").setViewName("test/ukraine_test_begin");
    }
}
