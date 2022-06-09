package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.service.DefaultUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegisterController {
    private final DefaultUserService userService;

    @GetMapping
    public String register(Model model) {
        model.addAttribute("userDetails", new UserDetails());
        return "userInterface/register";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("userDetails") @Valid UserDetails userDetails, BindingResult result) {
        if (result.hasErrors()) {
            return "userInterface/register";

        } else {
            userService.saveUser(userDetails);
            return "dashboard/successRegister";
        }
    }
}
