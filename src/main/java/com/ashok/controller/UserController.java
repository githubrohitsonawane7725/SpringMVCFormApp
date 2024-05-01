// UserController.java
package com.ashok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ashok.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/form")
    public String displayForm(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/register")
    public String registerUser(Model model, User user) {
        model.addAttribute("user", user);
        return "display";
    }
}

