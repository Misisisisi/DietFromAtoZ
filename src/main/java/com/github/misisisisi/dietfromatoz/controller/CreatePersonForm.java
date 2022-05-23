package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.UserEntity;
import lombok.*;

import javax.validation.constraints.*;

@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class CreatePersonForm {

    @NotBlank
    private String sex;
    @NotNull @Positive
    private double bodyWeight;
    @NotNull @Max(250) @Min(50)
    private int bodyHeight;
    @NotNull @Max(120) @PositiveOrZero
    private int age;
    @NotBlank
    private String activity;
    @NotBlank
    private String aim;
    private UserEntity user;
}
