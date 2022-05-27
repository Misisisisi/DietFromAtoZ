package com.github.misisisisi.dietfromatoz.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table (name="products")
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class ProductEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
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
    private UserEntity owner;

}
