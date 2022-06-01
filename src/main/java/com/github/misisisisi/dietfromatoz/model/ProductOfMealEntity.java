package com.github.misisisisi.dietfromatoz.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="productOfMeal")
@Getter @Setter @ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class ProductOfMealEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
    @ManyToOne
    private DayNameEntity dayName;
    @ManyToOne
    private MealNameEntity mealName;
    @ManyToOne
    private UserEntity owner;

    public ProductOfMealEntity(String productName, double energyValue, double protein, double carbohydrates, double fats, double weight) {
    productName=this.productName;
    energyValue=this.energyValue;
    protein=this.protein;
    carbohydrates=this.carbohydrates;
    fats=this.fats;
    weight=this.weight;
    }
}
