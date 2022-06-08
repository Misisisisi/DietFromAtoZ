package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.validator.ProductExistsConstraint;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString @EqualsAndHashCode(of="id")
@NoArgsConstructor
@AllArgsConstructor @Builder
public class CreateProductForm {

    @NotBlank (message = "Podaj nazwę produktu")
    @ProductExistsConstraint (message = "Produkt już istnieje w bazie")
    private String productName;
    @Min(0) @Max(900)
    private double energyValue;
    @Min(0) @Max(100)
    private double protein;
    @Min(0) @Max(100)
    private double carbohydrates;
    @Min(0) @Max(100)
    private double fats;

}
