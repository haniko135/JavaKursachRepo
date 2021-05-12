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
        registry.addViewController("test/ukraine_test_begin.html").setViewName("test/ukraine_test_begin");
    }
}
