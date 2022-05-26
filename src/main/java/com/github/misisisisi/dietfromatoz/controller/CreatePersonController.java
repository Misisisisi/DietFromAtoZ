package com.github.misisisisi.dietfromatoz.controller;


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

    double resultCPM;
    double resultEndCPM;
    double resultPPM;

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
            resultPPM=cpmService.countPPM(createPersonForm.getSex(), createPersonForm.getBodyWeight(), createPersonForm.getBodyHeight(), createPersonForm.getAge());
            resultCPM = cpmService.countCPM( createPersonForm.getActivity());
            resultEndCPM = cpmService.countEndCPM(createPersonForm.getAim());
            resultPPM=Math.round(resultPPM);
             resultCPM=Math.round(resultCPM);
             resultEndCPM=Math.round(resultEndCPM);
            System.out.println(resultPPM);
            System.out.println(resultCPM);
            System.out.println(resultEndCPM);
            return "/personData/resultCPM";
        }
    }
    @ModelAttribute
    public void addAttributes2 (Model model) {
        model.addAttribute("resultPPM", resultPPM);
        model.addAttribute("resultCPM", resultCPM);
        model.addAttribute("resultEndCPM", resultEndCPM);
    }
}

