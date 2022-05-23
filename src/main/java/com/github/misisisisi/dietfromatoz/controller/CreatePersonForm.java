package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.model.UserEntity;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class CreatePersonForm {

    @NotBlank
    private String sex;
    @NotNull
    private double bodyWeight;
    @NotNull
    private int bodyHeight;
    @NotNull
    private int age;
    @NotBlank
    private String activity;
    @NotBlank
    private String aim;
    private UserEntity user;
}
