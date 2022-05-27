package com.github.misisisisi.dietfromatoz.controller;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString @EqualsAndHashCode(of="id")
@NoArgsConstructor
@AllArgsConstructor @Builder
public class CreateProductForm {

    @NotBlank
    private String productName;
    @NotNull
    private double energyValue;
    @NotNull
    private double protein;
    @NotNull
    private double carbohydrates;
    @NotNull
    private double fats;
    @NotNull
    private double weight;
}
