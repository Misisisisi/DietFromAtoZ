package com.github.misisisisi.dietfromatoz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("home")
    public String homePage(){
        return "dashboard/homePage";
    }
}
