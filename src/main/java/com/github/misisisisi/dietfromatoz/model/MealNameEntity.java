package com.github.misisisisi.dietfromatoz.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="meals")
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class MealNameEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String name;
    @OneToMany
    private List<ProductOfMealEntity> listOfProducts = new ArrayList<>();
    @ManyToOne
    private UserEntity owner;


}
