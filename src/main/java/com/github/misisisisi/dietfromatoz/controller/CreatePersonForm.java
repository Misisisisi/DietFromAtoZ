package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.UserEntity;
import lombok.*;

import javax.validation.constraints.*;

@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class CreatePersonForm {

    @NotBlank (message = "Wybierz płeć")
    private String sex;
    @NotNull @Positive (message = "Podaj swoją masę ciała")
    private double bodyWeight;
    @NotNull @Max(250) @Min(50)
    private int bodyHeight;
    @NotNull @Min(1) @Max(120)
    private int age;
    @NotBlank (message = "Wybierz poziom aktywności swojej fizycznej")
    private String activity;
    @NotBlank (message = "Wybierz swój cel")
    private String aim;
    private UserEntity user;
}
