package com.github.misisisisi.dietfromatoz.controller;


import com.github.misisisisi.dietfromatoz.model.PersonDataEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class PersonController {

    @GetMapping("add-person")
    public String addNewPerson(Model model) {
        model.addAttribute("person", new PersonDataEntity());
        return "personForm-add";
    }
}
