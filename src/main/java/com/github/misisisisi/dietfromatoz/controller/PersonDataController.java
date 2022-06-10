package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.PersonDataEntity;
import com.github.misisisisi.dietfromatoz.model.ResultsEnergyEntity;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.PersonRepository;
import com.github.misisisisi.dietfromatoz.repository.ResultEnergyRepository;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class PersonDataController {

    private final ResultEnergyRepository resultEnergyRepository;

    private final PersonRepository personRepository;

    private final UserRepository userRepository;

    @GetMapping("data")
    public String personData(Model model) {

        List<PersonDataEntity> personData = personRepository.findAll();

        if (personData.size()==0) {
            String emptyData = "Nie wprowadzałeś jeszcze swoich danych.";
            model.addAttribute("emptyData", emptyData);
        }
        model.addAttribute("personData", personData);

        List<ResultsEnergyEntity> allEnergyValues = resultEnergyRepository.findAll();
        if (allEnergyValues.size()==0) {
            String emptyEnergyValues = "Nie obliczyłeś jeszcze swojego zapotrzebowania.";
            model.addAttribute("emptyEnergyValues", emptyEnergyValues);
        }
        model.addAttribute("allEnergyValues", allEnergyValues);

        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        org.springframework.security.core.userdetails.UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        UserEntity username = userRepository.findUserByUsername(userDetails.getUsername());
        String firstName = username.getFirstName();
        String lastName = username.getLastName();

        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);

        return "personData/addData";
    }
}