package com.github.misisisisi.dietfromatoz.controller;

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
    double resultBMI;

    @GetMapping
    public String prepareView(Model model) {
        model.addAttribute("bmiCalcForm", new BmiCalcForm());
        return "/personData/count_BMI";
    }

    @PostMapping
    public String processView(@ModelAttribute("bmiCalcForm") @Valid BmiCalcForm bmiCalcForm, BindingResult result) {
        if (result.hasErrors()) {
            return "/personData/count_BMI";
        } else {
            resultBMI = bmiService.countBMI(bmiCalcForm.getBodyWeight(), bmiCalcForm.getBodyHeight());
           //do poprawy wrzucenie wyniku BMI do widoku
            resultBMI = Math.round(resultBMI);
            System.out.print(resultBMI);
            return "/personData/resultBMI";
        }
    }

    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("bmi", resultBMI);
    }
}
