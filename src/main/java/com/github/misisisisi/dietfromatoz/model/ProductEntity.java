package com.github.misisisisi.dietfromatoz.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

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
    @NotBlank
    private double energyValue;
    @NotBlank
    private double protein;
    @NotBlank
    private double carbohydrates;
    @NotBlank
    private double fats;
    @NotBlank
    private double weight;
    @ManyToOne
    private UserEntity owner;

}
