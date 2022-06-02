package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.*;
import com.github.misisisisi.dietfromatoz.repository.AddProductToMealRepository;
import com.github.misisisisi.dietfromatoz.repository.DayNameRepository;
import com.github.misisisisi.dietfromatoz.repository.MealNameRepository;
import com.github.misisisisi.dietfromatoz.service.AddProductToMealService;
import com.github.misisisisi.dietfromatoz.service.DefaultPlanMealService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/planMeals")
@RequiredArgsConstructor
public class PlanMealsController {

    private final DefaultPlanMealService planMealService;
    private final AddProductToMealService addProductToMealService;
    private final DayNameRepository dayNameRepository;
    private final MealNameRepository mealNameRepository;
    private final AddProductToMealRepository addProductToMealRepository;


    @GetMapping("/{dayName}")
    public String prepareView(@PathVariable("dayName") String dayName, Model model) {
        DayNameEntity dayNameEntity = new DayNameEntity(dayName);
        model.addAttribute("nameOfDay", dayNameEntity);
        model.addAttribute("planMealsForm", new PlanMealsForm());
        List<ProductOfMealEntity> allByDayNameAndMealName = addProductToMealRepository.findAllBreakfastFromDay(dayName);
        model.addAttribute("allByDayNameAndMealName", allByDayNameAndMealName);
        System.out.println(dayName);
        return "/meals/planMeals";
    }


    @PostMapping(value = "editDayName", params = "editDay")
    public String editDayName(@ModelAttribute("nameOfDay") @Valid DayNameEntity dayName, BindingResult result) {
        System.out.println(dayName.getDayName() + "<-test");
        return "redirect:/planMeals/" + dayName.getDayName();
    }


    @GetMapping
    public String prepareView(Model model) {
        model.addAttribute("nameOfDay", new DayNameEntity());
        model.addAttribute("planMealsForm", new PlanMealsForm());
//        List<ProductOfMealEntity> allByDayNameAndMealName = addProductToMealRepository.findAllByDayNameAndMealName(dayName , mealName);
//        model.addAttribute("allByDayNameAndMealName", allByDayNameAndMealName);
        return "/meals/planMeals";
    }

    @PostMapping(params = "addProductToFirstMeal")
    public String addProductToFirstMeal(@ModelAttribute("planMealsForm") PlanMealsForm planMealsForm, Model model) {

//        if (result.hasErrors()) {
//            return "redirect:/planMeals";
//        } else {
        {
            System.out.println(planMealsForm.getDayName() + "<- test nazwy dnia");
//            System.out.println(planMealsForm.getProductName());
//            System.out.println(planMealsForm.getWeight());
            DayNameEntity dayName = dayNameRepository.findDayNameEntityByDayName(planMealsForm.getDayName());
            MealNameEntity mealName = mealNameRepository.findMealNameEntityByMealName(planMealsForm.getMealName());
            ProductEntity productByName = planMealService.loadProductByName(planMealsForm.getProductName());
            double protein = productByName.getProtein() * (planMealsForm.getWeight() / productByName.getWeight());
            double carbohydrates = productByName.getCarbohydrates() * (planMealsForm.getWeight() / productByName.getWeight());
            double fats = productByName.getFats() * (planMealsForm.getWeight() / productByName.getWeight());
            double energyValue = productByName.getEnergyValue() * (planMealsForm.getWeight() / productByName.getWeight());

            protein = Math.round(protein);
            carbohydrates = Math.round(carbohydrates);
            fats = Math.round(fats);
            energyValue = Math.round(energyValue);
            ProductsOfMeal productsOfMeal = new ProductsOfMeal(planMealsForm.getProductName(), protein, carbohydrates, fats, energyValue, planMealsForm.getWeight(), dayName, mealName);
//            planMealsForm.getProductOfMealList().add(productOfMeal);
//            System.out.println(energyValue);
            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);

//            model.addAttribute("dayName", dayName);
            model.addAttribute("mealName", mealName);
//            model.addAttribute("planMealsForm", planMealsForm.getProductOfMealList());

            return "redirect:/home";
        }
    }
}
