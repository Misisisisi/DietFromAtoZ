package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.controller.PlanMealsForm;
import com.github.misisisisi.dietfromatoz.model.ProductOfMealEntity;
import com.github.misisisisi.dietfromatoz.model.ProductsOfMeal;
import com.github.misisisisi.dietfromatoz.repository.AddProductToMealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AddProductToMealService {

    private final AddProductToMealRepository addProductToMealRepository;

    @Transactional
    public void saveProductOfMeal(PlanMealsForm planMealsForm, ProductsOfMeal productsOfMeal) {
        addProductToMealRepository.save(ProductOfMealEntity.builder()
                .productName(planMealsForm.getProductName())
                .weight(planMealsForm.getWeight())
                .energyValue(productsOfMeal.getEnergyValue())
                .protein(productsOfMeal.getProtein())
                .carbohydrates(productsOfMeal.getCarbohydrates())
                .fats(productsOfMeal.getFats())
                .mealName(productsOfMeal.getMealName())
                .dayName(productsOfMeal.getDayName())
//                .owner(createProductForm.getUser())
                .build());

    }


}
