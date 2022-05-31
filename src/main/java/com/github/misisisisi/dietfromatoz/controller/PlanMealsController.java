package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.model.ProductOfMeal;
import com.github.misisisisi.dietfromatoz.service.DefaultPlanMealService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


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

    @PostMapping(params = "addProductToFirstMeal")
    public String addProductToFirstMeal(@ModelAttribute("planMealsForm") @Valid PlanMealsForm planMealsForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/meals/planMeals";
        } else {
            System.out.println(planMealsForm.getProductName());
            System.out.println(planMealsForm.getWeight());
            ProductEntity productByName = planMealService.loadProductByName(planMealsForm.getProductName());
            double protein = productByName.getProtein() * (planMealsForm.getWeight() / productByName.getWeight());
            double carbohydrates = productByName.getCarbohydrates() * (planMealsForm.getWeight() / productByName.getWeight());
            double fats = productByName.getFats() * (planMealsForm.getWeight() / productByName.getWeight());
            double energyValue = productByName.getEnergyValue() * (planMealsForm.getWeight() / productByName.getWeight());

            double roundProtein = Math.round(protein);
            double roundCarbohydrates = Math.round(carbohydrates);
            double roundFats = Math.round(fats);
            double roundEnergyValue = Math.round(energyValue);

            ProductOfMeal addingProduct = new ProductOfMeal(productByName.getProductName(), roundEnergyValue, roundProtein, roundCarbohydrates, roundFats, planMealsForm.getWeight());
            planMealsForm.getProductOfMealList().add(addingProduct);
            System.out.println(energyValue);
            model.addAllAttributes(planMealsForm.getProductOfMealList());
//            model.addAttribute("planMealsForm", planMealsForm.getProductOfMealList());
            return "/meals/planMeals";
        }
    }

    @PostMapping(params = "removeProductFromFirstMeal")
    public String removeProductFromFirstMeal(@ModelAttribute PlanMealsForm planMealsForm, @RequestParam int removeProduct) {
        planMealsForm.getProductOfMealList().remove(removeProduct);
        return "/meals/planMeals";
    }
}
