package com.github.misisisisi.dietfromatoz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/successRegister")
@RequiredArgsConstructor
public class SuccessRegisterController {



    @GetMapping
    public String successRegister(){
        return "dashboard/successRegister";
    }

}