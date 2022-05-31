package com.github.misisisisi.dietfromatoz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductOfMeal {

    private String productName;

    private double energyValue;

    private double protein;

    private double carbohydrates;

    private double fats;

    private double weight;


    }
