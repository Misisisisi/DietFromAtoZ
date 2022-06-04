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

        double breakfastEnergy = 0;
        double breakfastProtein = 0;
        double breakfastCarbohydrates = 0;
        double breakfastFats = 0;

        for (int i = 0; i < allByBreakfast.size(); i++) {
            breakfastEnergy += allByBreakfast.get(i).getEnergyValue();
            breakfastProtein += allByBreakfast.get(i).getProtein();
            breakfastCarbohydrates += allByBreakfast.get(i).getCarbohydrates();
            breakfastFats += allByBreakfast.get(i).getFats();
        }

        model.addAttribute("breakfastEnergy", breakfastEnergy);
        model.addAttribute("breakfastProtein", breakfastProtein);
        model.addAttribute("breakfastCarbohydrates", breakfastCarbohydrates);
        model.addAttribute("breakfastFats", breakfastFats);

        List<ProductOfMealEntity> allBySecondBreakfast = addProductToMealRepository.findAllSecondBreakfastFromDay(dayName);
        model.addAttribute("allBySecondBreakfast", allBySecondBreakfast);

        double secondBreakfastEnergy = 0;
        double secondBreakfastProtein = 0;
        double secondBreakfastCarbohydrates = 0;
        double secondBreakfastFats = 0;

        for (int i = 0; i < allBySecondBreakfast.size(); i++) {
            secondBreakfastEnergy += allBySecondBreakfast.get(i).getEnergyValue();
            secondBreakfastProtein += allBySecondBreakfast.get(i).getProtein();
            secondBreakfastCarbohydrates += allBySecondBreakfast.get(i).getCarbohydrates();
            secondBreakfastFats += allBySecondBreakfast.get(i).getFats();
        }

        model.addAttribute("secondBreakfastEnergy", secondBreakfastEnergy);
        model.addAttribute("secondBreakfastProtein", secondBreakfastProtein);
        model.addAttribute("secondBreakfastCarbohydrates", secondBreakfastCarbohydrates);
        model.addAttribute("secondBreakfastFats", secondBreakfastFats);

        List<ProductOfMealEntity> allByLunch = addProductToMealRepository.findAlLunchFromDay(dayName);
        model.addAttribute("allByLunch", allByLunch);

        double lunchEnergy = 0;
        double lunchProtein = 0;
        double lunchCarbohydrates = 0;
        double lunchFats = 0;

        for (int i = 0; i < allByLunch.size(); i++) {
            lunchEnergy += allByLunch.get(i).getEnergyValue();
            lunchProtein += allByLunch.get(i).getProtein();
            lunchCarbohydrates += allByLunch.get(i).getCarbohydrates();
            lunchFats += allByLunch.get(i).getFats();
        }

        model.addAttribute("lunchEnergy", lunchEnergy);
        model.addAttribute("lunchProtein", lunchProtein);
        model.addAttribute("lunchCarbohydrates", lunchCarbohydrates);
        model.addAttribute("lunchFats", lunchFats);

        List<ProductOfMealEntity> allByTea = addProductToMealRepository.findAlTeaFromDay(dayName);
        model.addAttribute("allByTea", allByTea);

        double teaEnergy = 0;
        double teaProtein = 0;
        double teaCarbohydrates = 0;
        double teaFats = 0;

        for (int i = 0; i < allByTea.size(); i++) {
            teaEnergy += allByTea.get(i).getEnergyValue();
            teaProtein += allByTea.get(i).getProtein();
            teaCarbohydrates += allByTea.get(i).getCarbohydrates();
            teaFats += allByTea.get(i).getFats();
        }

        model.addAttribute("teaEnergy", teaEnergy);
        model.addAttribute("teaProtein", teaProtein);
        model.addAttribute("teaCarbohydrates", teaCarbohydrates);
        model.addAttribute("teaFats", teaFats);

        List<ProductOfMealEntity> allByDinner = addProductToMealRepository.findAlDinnerFromDay(dayName);
        model.addAttribute("allByDinner", allByDinner);

        double dinnerEnergy = 0;
        double dinnerProtein = 0;
        double dinnerCarbohydrates = 0;
        double dinnerFats = 0;

        for (int i = 0; i < allByDinner.size(); i++) {
            dinnerEnergy += allByDinner.get(i).getEnergyValue();
            dinnerProtein += allByDinner.get(i).getProtein();
            dinnerCarbohydrates += allByDinner.get(i).getCarbohydrates();
            dinnerFats += allByDinner.get(i).getFats();
        }

        model.addAttribute("dinnerEnergy", dinnerEnergy);
        model.addAttribute("dinnerProtein", dinnerProtein);
        model.addAttribute("dinnerCarbohydrates", dinnerCarbohydrates);
        model.addAttribute("dinnerFats", dinnerFats);


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
