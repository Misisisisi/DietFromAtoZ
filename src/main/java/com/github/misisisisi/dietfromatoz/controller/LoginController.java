package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final UserRepository userRepository;
    @GetMapping
    public String login(Model model){
        model.addAttribute("createUserForm", new CreateUserForm());
        return "userInterface/login";
    }


}
