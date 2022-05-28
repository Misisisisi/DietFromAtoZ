package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.service.DefaultPlanMealService;
import com.github.misisisisi.dietfromatoz.service.PlanMealService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/planMeals")
@RequiredArgsConstructor
public class PlanMealsController {

private final DefaultPlanMealService planMealService;

    @GetMapping
    public String prepareView(Model model) {
        model.addAttribute("planMealsForm", new PlanMealsForm());
        return "/meals/planMeals";
    }
}
