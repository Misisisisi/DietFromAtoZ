package com.github.misisisisi.dietfromatoz.controller;


import com.github.misisisisi.dietfromatoz.model.Results;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.PersonRepository;
import com.github.misisisisi.dietfromatoz.repository.ResultEnergyRepository;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import com.github.misisisisi.dietfromatoz.service.CpmService;
import com.github.misisisisi.dietfromatoz.service.PersonService;
import com.github.misisisisi.dietfromatoz.service.ResultEnergyService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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
    private final ResultEnergyService resultEnergyService;
    private final UserRepository userRepository;
    private final PersonRepository personRepository;
    private final ResultEnergyRepository resultEnergyRepository;

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

            UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
            org.springframework.security.core.userdetails.UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            UserEntity username = userRepository.findUserByUsername(userDetails.getUsername());
            if (personRepository.findPersonDataEntityByUserName(username.getUsername()) == null) {
                personService.savePersonData(createPersonForm, username);
            }
            personService.updateData(createPersonForm, username);


            double resultPPM = cpmService.countPPM(createPersonForm.getSex(), createPersonForm.getBodyWeight(), createPersonForm.getBodyHeight(), createPersonForm.getAge());
            double resultCPM = cpmService.countCPM(createPersonForm.getActivity());
            double resultEndCPM = cpmService.countEndCPM(createPersonForm.getAim());
            resultPPM = Math.round(resultPPM);
            resultCPM = Math.round(resultCPM);
            resultEndCPM = Math.round(resultEndCPM);
            Results resultsEnergy = new Results(resultCPM, resultEndCPM, resultPPM, username);
            model.addAttribute("result", resultsEnergy);

            if (resultEnergyRepository.findResultEnergyEntityByUserName(username.getUsername()) == null) {
                resultEnergyService.saveEnergyValues(resultsEnergy);
            }
            resultEnergyService.updateEnergyValues(resultsEnergy);

            return "/personData/resultCPM";
        }
    }
}

