package com.github.misisisisi.dietfromatoz.controller;


import com.github.misisisisi.dietfromatoz.model.Results;
import com.github.misisisisi.dietfromatoz.service.CpmService;
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
    private final CpmService cpmService;


    @GetMapping
    public String prepareView(Model model) {
        model.addAttribute("createPersonForm", new CreatePersonForm());
        return "/personData/create";
    }


    @PostMapping
    public String processView(@ModelAttribute("createPersonForm") @Valid CreatePersonForm createPersonForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/personData/create";
        } else {
            personService.savePersonData(createPersonForm);
            double resultPPM = cpmService.countPPM(createPersonForm.getSex(), createPersonForm.getBodyWeight(), createPersonForm.getBodyHeight(), createPersonForm.getAge());
            double resultCPM = cpmService.countCPM(createPersonForm.getActivity());
            double resultEndCPM = cpmService.countEndCPM(createPersonForm.getAim());
            resultPPM = Math.round(resultPPM);
            resultCPM = Math.round(resultCPM);
            resultEndCPM = Math.round(resultEndCPM);
            model.addAttribute("result", new Results(resultCPM, resultEndCPM, resultPPM));


            return "/personData/resultCPM";
        }
    }
}

