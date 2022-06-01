package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.model.ProductOfMealEntity;
import com.github.misisisisi.dietfromatoz.model.ProductsOfMeal;
import com.github.misisisisi.dietfromatoz.repository.AddProductToMealRepository;
import com.github.misisisisi.dietfromatoz.service.AddProductToMealService;
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
    private final AddProductToMealService addProductToMealService;

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

            protein = Math.round(protein);
            carbohydrates = Math.round(carbohydrates);
            fats = Math.round(fats);
            energyValue = Math.round(energyValue);
            ProductsOfMeal productsOfMeal = new ProductsOfMeal(planMealsForm.getProductName(), protein, carbohydrates, fats, energyValue, planMealsForm.getWeight());
//            planMealsForm.getProductOfMealList().add(productOfMeal);
            System.out.println(energyValue);
            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);

//            model.addAttribute("productOfMeal", );
//            model.addAttribute("planMealsForm", planMealsForm.getProductOfMealList());
            return "/meals/planMeals";
        }
    }

//    @PostMapping(params = "removeProductFromFirstMeal")
//    public String removeProductFromFirstMeal(@ModelAttribute PlanMealsForm planMealsForm, @RequestParam int removeProduct) {
//        planMealsForm.getProductOfMealList().remove(removeProduct);
//        return "/meals/planMeals";
//    }
}
