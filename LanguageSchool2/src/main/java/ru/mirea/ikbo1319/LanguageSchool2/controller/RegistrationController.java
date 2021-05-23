package ru.mirea.ikbo1319.LanguageSchool2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.mirea.ikbo1319.LanguageSchool2.entity.Role;
import ru.mirea.ikbo1319.LanguageSchool2.entity.Users;
import ru.mirea.ikbo1319.LanguageSchool2.repository.UsersRepo;

import javax.validation.Valid;
import java.util.Collections;

@Controller
public class RegistrationController {
    @Autowired
    UsersRepo usersRepo;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@Valid Users user){
        if (user.getPassword() != null && !user.getPassword().equals(user.getPasswordConfirm())){
            System.out.println("Пароли разные");
        }
        Users users = usersRepo.findByUsername(user.getUsername());
        if (users != null){
            System.out.println("Пользователь существует!");
            return "registration";
        }

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        usersRepo.save(user);
        System.out.println(user.toString());

        return "redirect:/login";
    }
}
