package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.DayNameEntity;
import com.github.misisisisi.dietfromatoz.model.MealNameEntity;
import com.github.misisisisi.dietfromatoz.model.ProductOfMealEntity;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor @Builder
public class PlanMealsForm {

    @NotBlank (message = "Podaj nazwę produktu")
    private String productName;
    @Positive (message = "Wartość musi być większa od 0")
    private double weight;
    @Builder.Default
    private List<ProductOfMealEntity> productOfMealList = new ArrayList<>();
    @NotBlank
    private String dayName;
//    @NotBlank
//    private String mealName;
}
