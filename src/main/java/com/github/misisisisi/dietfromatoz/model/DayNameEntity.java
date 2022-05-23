package com.github.misisisisi.dietfromatoz.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="meals")
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class DayNameEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @DateTimeFormat
    private LocalDate date;
    @NotBlank
    private String dayName;
    @ManyToMany
    private List<MealNameEntity> listOfMealsNames = new ArrayList<>();
    @ManyToOne
    private UserEntity owner;
}