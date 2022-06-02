package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import com.github.misisisisi.dietfromatoz.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

//    private final UserService userService;

    @GetMapping
    public String login(Model model){
        model.addAttribute("loginForm", new LoginForm());

        return "userInterface/login";
    }
//    @GetMapping
//    public String processLogin(@ModelAttribute("createUserForm") @Valid CreateUserForm createUserForm, BindingResult result) {
//        if (result.hasErrors()) {
//            return "userInterface/login";
//
//        } else {
//            userService.saveUser(createUserForm);
//            return "dashboard/homePage";
//        }
//    }
}
