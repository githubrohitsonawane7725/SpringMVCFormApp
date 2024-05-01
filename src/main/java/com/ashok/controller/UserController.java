package com.ashok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashok.model.User;

@Controller
public class UserController {

    @GetMapping("/registration")
    public String displayRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registrationForm";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, Model model) {
        // Here, you can add validation logic if needed
        model.addAttribute("user", user);
        return "registrationConfirmation";
    }
}
