package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.ResultBMI;
import com.github.misisisisi.dietfromatoz.service.BmiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/count_BMI")
@RequiredArgsConstructor
public class BmiCounterController {

    private final BmiService bmiService;

    @GetMapping
    public String prepareView(Model model) {
        model.addAttribute("bmiCalcForm", new BmiCalcForm());
        return "/personData/count_BMI";
    }

    @PostMapping
    public String processView(@ModelAttribute("bmiCalcForm") @Valid BmiCalcForm bmiCalcForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/personData/count_BMI";
        } else {
            double resultBMI = bmiService.countBMI(bmiCalcForm.getBodyWeight(), bmiCalcForm.getBodyHeight());
            resultBMI = Math.round(resultBMI);
            model.addAttribute("resultBMI", new ResultBMI(resultBMI));
            return "/personData/resultBMI";
        }
    }
}
