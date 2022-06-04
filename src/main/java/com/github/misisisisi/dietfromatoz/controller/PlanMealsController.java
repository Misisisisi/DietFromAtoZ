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
        List<ProductOfMealEntity> allByBreakfast = addProductToMealRepository.findAllBreakfastFromDay(dayName);
        model.addAttribute("allByBreakfast", allByBreakfast);
        List<ProductOfMealEntity> allBySecondBreakfast = addProductToMealRepository.findAllSecondBreakfastFromDay(dayName);
        model.addAttribute("allBySecondBreakfast", allBySecondBreakfast);
        List<ProductOfMealEntity> allByLunch = addProductToMealRepository.findAlLunchFromDay(dayName);
        model.addAttribute("allByLunch", allByLunch);
        List<ProductOfMealEntity> allByTea = addProductToMealRepository.findAlTeaFromDay(dayName);
        model.addAttribute("allByTea", allByTea);
        List<ProductOfMealEntity> allByDinner = addProductToMealRepository.findAlDinnerFromDay(dayName);
        model.addAttribute("allByDinner", allByDinner);


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

        return "/meals/planMeals";
    }

    @PostMapping(params = "addProductToFirstMeal")
    public String addProductToFirstMeal(@ModelAttribute("planMealsForm") PlanMealsForm planMealsForm) {

        {

            DayNameEntity dayName = dayNameRepository.findDayNameEntityByDayName(planMealsForm.getDayName());
            MealNameEntity mealName = mealNameRepository.findMealNameEntityByMealName("Śniadanie");
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

            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);

            return "redirect:/planMeals/" + dayName.getDayName();
        }
    }

    @PostMapping(params = "addProductToSecondMeal")
    public String addProductToSecondMeal(@ModelAttribute("planMealsForm") PlanMealsForm planMealsForm) {

        {

            DayNameEntity dayName = dayNameRepository.findDayNameEntityByDayName(planMealsForm.getDayName());
            MealNameEntity mealName = mealNameRepository.findMealNameEntityByMealName("II śniadanie");
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

            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);

            return "redirect:/planMeals/" + dayName.getDayName() + "#secondBreakfast";
        }
    }

    @PostMapping(params = "addProductToThirdMeal")
    public String addProductToThirdMeal(@ModelAttribute("planMealsForm") PlanMealsForm planMealsForm) {

        {

            DayNameEntity dayName = dayNameRepository.findDayNameEntityByDayName(planMealsForm.getDayName());
            MealNameEntity mealName = mealNameRepository.findMealNameEntityByMealName("Obiad");
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

            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);

            return "redirect:/planMeals/" + dayName.getDayName() + "#lunch";
        }
    }

    @PostMapping(params = "addProductToFourthMeal")
    public String addProductToFourthMeal(@ModelAttribute("planMealsForm") PlanMealsForm planMealsForm) {

        {

            DayNameEntity dayName = dayNameRepository.findDayNameEntityByDayName(planMealsForm.getDayName());
            MealNameEntity mealName = mealNameRepository.findMealNameEntityByMealName("Podwieczorek");
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

            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);

            return "redirect:/planMeals/" + dayName.getDayName() + "#tea";
        }
    }

    @PostMapping(params = "addProductToFifthMeal")
    public String addProductToFifthMeal(@ModelAttribute("planMealsForm") PlanMealsForm planMealsForm) {

        {

            DayNameEntity dayName = dayNameRepository.findDayNameEntityByDayName(planMealsForm.getDayName());
            MealNameEntity mealName = mealNameRepository.findMealNameEntityByMealName("Kolacja");
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

            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);

            return "redirect:/planMeals/" + dayName.getDayName() + "#dinner";
        }
    }
}
