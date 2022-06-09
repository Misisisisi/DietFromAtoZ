package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.PersonDataEntity;
import com.github.misisisisi.dietfromatoz.model.ResultsEnergyEntity;
import com.github.misisisisi.dietfromatoz.repository.PersonRepository;
import com.github.misisisisi.dietfromatoz.repository.ResultEnergyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class PersonDataController {

    private final ResultEnergyRepository resultEnergyRepository;

    private final PersonRepository personRepository;

    @GetMapping("data")
    public String personData(Model model) {

        List<PersonDataEntity> personData = personRepository.findAll();
        model.addAttribute("personData", personData);

        List<ResultsEnergyEntity> allEnergyValues = resultEnergyRepository.findAll();
        if (allEnergyValues.isEmpty()) {
            String emptyEnergyValues = "Nie obliczyłeś swojego zapotrzebowania.";
            model.addAttribute("emptyEnergyValues", emptyEnergyValues);
        }

        model.addAttribute("allEnergyValues", allEnergyValues);

        return "personData/addData";
    }
}