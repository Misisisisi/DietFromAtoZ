package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.*;
import com.github.misisisisi.dietfromatoz.repository.*;
import com.github.misisisisi.dietfromatoz.service.AddProductToMealService;
import com.github.misisisisi.dietfromatoz.service.DefaultPlanMealService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
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
    private final RemoveProductFromMealRepository removeProductFromMealRepository;
    private final ResultEnergyRepository resultEnergyRepository;
    private final UserRepository userRepository;


    @GetMapping("/{dayName}")
    public String prepareView(@PathVariable("dayName") String dayName, Model model) {
        DayNameEntity dayNameEntity = new DayNameEntity(dayName);
        model.addAttribute("nameOfDay", dayNameEntity);
        model.addAttribute("planMealsForm", new PlanMealsForm());

        List<ResultsEnergyEntity> allEnergyValues = resultEnergyRepository.findAll();
        if (allEnergyValues.isEmpty()) {
            String emptyEnergyValues = "Nie obliczyłeś swojego zapotrzebowania.";
            model.addAttribute("emptyEnergyValues", emptyEnergyValues);
        }

        model.addAttribute("allEnergyValues", allEnergyValues);

        double proteinValue = 0;
        double carbohydratesValue = 0;
        double fatValue = 0;
        double energyValue = 0;

        for (int i = 0; i < allEnergyValues.size(); i++) {
            energyValue += allEnergyValues.get(i).getResultEndCPM();
        }

        proteinValue = Math.round((energyValue * 0.2) / 4);

        carbohydratesValue = Math.round((energyValue * 0.5) / 4);
        fatValue = Math.round((energyValue * 0.3) / 9);

        model.addAttribute("energyValue", energyValue);
        model.addAttribute("proteinValue", proteinValue);
        model.addAttribute("carbohydratesValue", carbohydratesValue);
        model.addAttribute("fatValue", fatValue);



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

        List<ProductOfMealEntity> allFromDay = addProductToMealRepository.findAllProductsFromDay(dayName);
        model.addAttribute("allFromDay", allFromDay);

        double allDayEnergy = 0;
        double allDayProtein = 0;
        double allDayCarbohydrates = 0;
        double allDayFats = 0;

        for (int i = 0; i < allFromDay.size(); i++) {
            allDayEnergy += allFromDay.get(i).getEnergyValue();
            allDayProtein += allFromDay.get(i).getProtein();
            allDayCarbohydrates += allFromDay.get(i).getCarbohydrates();
            allDayFats += allFromDay.get(i).getFats();
        }

        model.addAttribute("allDayEnergy", allDayEnergy);
        model.addAttribute("allDayProtein", allDayProtein);
        model.addAttribute("allDayCarbohydrates", allDayCarbohydrates);
        model.addAttribute("allDayFats", allDayFats);
        System.out.println(dayName + "test1");

        return "/meals/planMeals";
    }


    @PostMapping(value = "editDayName", params = "editDay")
    public String editDayName(@ModelAttribute("nameOfDay") @Valid DayNameEntity dayName, BindingResult result) throws UnsupportedEncodingException {
        System.out.println(dayName.getDayName() + "<-test");
        String encodeDay = URLEncoder.encode(dayName.getDayName(), StandardCharsets.UTF_8);
        return "redirect:/planMeals/" + encodeDay;
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
            UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken)SecurityContextHolder.getContext().getAuthentication();
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            UserEntity username = userRepository.findUserByUsername(userDetails.getUsername());
            DayNameEntity dayName = dayNameRepository.findDayNameEntityByDayName(planMealsForm.getDayName());
            MealNameEntity mealName = mealNameRepository.findMealNameEntityByMealName("Śniadanie");
            ProductEntity productByName = planMealService.loadProductByName(planMealsForm.getProductName());

            if (productByName == null) {
                return "/product/outOfDb";
            }

            double protein = productByName.getProtein() * (planMealsForm.getWeight() / productByName.getWeight());
            double carbohydrates = productByName.getCarbohydrates() * (planMealsForm.getWeight() / productByName.getWeight());
            double fats = productByName.getFats() * (planMealsForm.getWeight() / productByName.getWeight());
            double energyValue = productByName.getEnergyValue() * (planMealsForm.getWeight() / productByName.getWeight());

            protein = Math.round(protein);
            carbohydrates = Math.round(carbohydrates);
            fats = Math.round(fats);
            energyValue = Math.round(energyValue);
            ProductsOfMeal productsOfMeal = new ProductsOfMeal(planMealsForm.getProductName(), protein, carbohydrates, fats, energyValue, planMealsForm.getWeight(), dayName, mealName, username);

            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);
            String encodeBreakfast = URLEncoder.encode(dayName.getDayName(), StandardCharsets.UTF_8);

            return "redirect:/planMeals/" + encodeBreakfast;
        }
    }

    @PostMapping(params = "addProductToSecondMeal")
    public String addProductToSecondMeal(@ModelAttribute("planMealsForm") PlanMealsForm planMealsForm) {

        {

            DayNameEntity dayName = dayNameRepository.findDayNameEntityByDayName(planMealsForm.getDayName());
            MealNameEntity mealName = mealNameRepository.findMealNameEntityByMealName("II śniadanie");
            ProductEntity productByName = planMealService.loadProductByName(planMealsForm.getProductName());
            UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken)SecurityContextHolder.getContext().getAuthentication();
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            UserEntity username = userRepository.findUserByUsername(userDetails.getUsername());
            if (productByName == null) {
                return "/product/outOfDb";
            }

            double protein = productByName.getProtein() * (planMealsForm.getWeight() / productByName.getWeight());
            double carbohydrates = productByName.getCarbohydrates() * (planMealsForm.getWeight() / productByName.getWeight());
            double fats = productByName.getFats() * (planMealsForm.getWeight() / productByName.getWeight());
            double energyValue = productByName.getEnergyValue() * (planMealsForm.getWeight() / productByName.getWeight());

            protein = Math.round(protein);
            carbohydrates = Math.round(carbohydrates);
            fats = Math.round(fats);
            energyValue = Math.round(energyValue);
            ProductsOfMeal productsOfMeal = new ProductsOfMeal(planMealsForm.getProductName(), protein, carbohydrates, fats, energyValue, planMealsForm.getWeight(), dayName, mealName, username);

            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);
            String encodeSecondBreakfast = URLEncoder.encode(dayName.getDayName(), StandardCharsets.UTF_8);

            return "redirect:/planMeals/" + encodeSecondBreakfast + "#secondBreakfast";
        }
    }

    @PostMapping(params = "addProductToThirdMeal")
    public String addProductToThirdMeal(@ModelAttribute("planMealsForm") PlanMealsForm planMealsForm) {

        {

            DayNameEntity dayName = dayNameRepository.findDayNameEntityByDayName(planMealsForm.getDayName());
            MealNameEntity mealName = mealNameRepository.findMealNameEntityByMealName("Obiad");
            ProductEntity productByName = planMealService.loadProductByName(planMealsForm.getProductName());
            UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken)SecurityContextHolder.getContext().getAuthentication();
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            UserEntity username = userRepository.findUserByUsername(userDetails.getUsername());

            if (productByName == null) {
                return "/product/outOfDb";
            }

            double protein = productByName.getProtein() * (planMealsForm.getWeight() / productByName.getWeight());
            double carbohydrates = productByName.getCarbohydrates() * (planMealsForm.getWeight() / productByName.getWeight());
            double fats = productByName.getFats() * (planMealsForm.getWeight() / productByName.getWeight());
            double energyValue = productByName.getEnergyValue() * (planMealsForm.getWeight() / productByName.getWeight());

            protein = Math.round(protein);
            carbohydrates = Math.round(carbohydrates);
            fats = Math.round(fats);
            energyValue = Math.round(energyValue);
            ProductsOfMeal productsOfMeal = new ProductsOfMeal(planMealsForm.getProductName(), protein, carbohydrates, fats, energyValue, planMealsForm.getWeight(), dayName, mealName, username);

            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);
            String encodeLunch = URLEncoder.encode(dayName.getDayName(), StandardCharsets.UTF_8);

            return "redirect:/planMeals/" + encodeLunch + "#lunch";
        }
    }

    @PostMapping(params = "addProductToFourthMeal")
    public String addProductToFourthMeal(@ModelAttribute("planMealsForm") PlanMealsForm planMealsForm) {

        {

            DayNameEntity dayName = dayNameRepository.findDayNameEntityByDayName(planMealsForm.getDayName());
            MealNameEntity mealName = mealNameRepository.findMealNameEntityByMealName("Podwieczorek");
            ProductEntity productByName = planMealService.loadProductByName(planMealsForm.getProductName());
            UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken)SecurityContextHolder.getContext().getAuthentication();
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            UserEntity username = userRepository.findUserByUsername(userDetails.getUsername());

            if (productByName == null) {
                return "/product/outOfDb";
            }

            double protein = productByName.getProtein() * (planMealsForm.getWeight() / productByName.getWeight());
            double carbohydrates = productByName.getCarbohydrates() * (planMealsForm.getWeight() / productByName.getWeight());
            double fats = productByName.getFats() * (planMealsForm.getWeight() / productByName.getWeight());
            double energyValue = productByName.getEnergyValue() * (planMealsForm.getWeight() / productByName.getWeight());

            protein = Math.round(protein);
            carbohydrates = Math.round(carbohydrates);
            fats = Math.round(fats);
            energyValue = Math.round(energyValue);
            ProductsOfMeal productsOfMeal = new ProductsOfMeal(planMealsForm.getProductName(), protein, carbohydrates, fats, energyValue, planMealsForm.getWeight(), dayName, mealName,username);

            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);
            String encodeTea = URLEncoder.encode(dayName.getDayName(), StandardCharsets.UTF_8);

            return "redirect:/planMeals/" + encodeTea + "#tea";
        }
    }

    @PostMapping(params = "addProductToFifthMeal")
    public String addProductToFifthMeal(@ModelAttribute("planMealsForm") PlanMealsForm planMealsForm) {

        {

            DayNameEntity dayName = dayNameRepository.findDayNameEntityByDayName(planMealsForm.getDayName());
            MealNameEntity mealName = mealNameRepository.findMealNameEntityByMealName("Kolacja");
            ProductEntity productByName = planMealService.loadProductByName(planMealsForm.getProductName());
            UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken)SecurityContextHolder.getContext().getAuthentication();
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            UserEntity username = userRepository.findUserByUsername(userDetails.getUsername());

            if (productByName == null) {
                return "/product/outOfDb";
            }

            double protein = productByName.getProtein() * (planMealsForm.getWeight() / productByName.getWeight());
            double carbohydrates = productByName.getCarbohydrates() * (planMealsForm.getWeight() / productByName.getWeight());
            double fats = productByName.getFats() * (planMealsForm.getWeight() / productByName.getWeight());
            double energyValue = productByName.getEnergyValue() * (planMealsForm.getWeight() / productByName.getWeight());

            protein = Math.round(protein);
            carbohydrates = Math.round(carbohydrates);
            fats = Math.round(fats);
            energyValue = Math.round(energyValue);
            ProductsOfMeal productsOfMeal = new ProductsOfMeal(planMealsForm.getProductName(), protein, carbohydrates, fats, energyValue, planMealsForm.getWeight(), dayName, mealName, username);

            addProductToMealService.saveProductOfMeal(planMealsForm, productsOfMeal);
            String encodeDinner = URLEncoder.encode(dayName.getDayName(), StandardCharsets.UTF_8);

            return "redirect:/planMeals/" + encodeDinner + "#dinner";
        }
    }

    @Transactional
    @PostMapping(value = "/{dayName}/remove/{id}", params = "removeProduct")
    public String removePerson(@PathVariable("dayName") String dayName, @PathVariable ("id") String id) {

        removeProductFromMealRepository.delete(removeProductFromMealRepository.findProductOfMealEntitiesById(Long.parseLong(id)));
        String encodeRemoveDay = URLEncoder.encode(dayName, StandardCharsets.UTF_8);
        return "redirect:/planMeals/" + encodeRemoveDay;
    }
}
