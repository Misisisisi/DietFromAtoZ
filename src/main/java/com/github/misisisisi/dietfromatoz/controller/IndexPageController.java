package com.github.misisisisi.dietfromatoz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

    @GetMapping
    public String mainPage(){
        return "homeInterface/index";
    }
}
