package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.PersonDataEntity;
import com.github.misisisisi.dietfromatoz.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/create_personData")
@RequiredArgsConstructor
public class CreatePersonController {

    private final PersonService personService;

    @GetMapping
    public String prepareView(Model model) {
        model.addAttribute("createPersonForm", new CreatePersonForm());
        return "/personData/create";
    }


    @PostMapping
    public String processView(@ModelAttribute("createPersonForm") @Valid CreatePersonForm createPersonForm, BindingResult result) {
        if (result.hasErrors()) {
            return "/personData/create";
        } else {
            personService.savePersonData(createPersonForm);
            return "/personData/count_CPM";
        }
    }
}

