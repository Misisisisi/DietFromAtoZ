package com.github.misisisisi.dietfromatoz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsOfMeal {
    String productName;
    double protein;
    double carbohydrates;
    double fats;
    double energyValue;
    double weight;
    DayNameEntity dayName;
    MealNameEntity mealName;

    }
