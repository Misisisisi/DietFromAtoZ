package com.github.misisisisi.dietfromatoz.controller;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor @Builder
public class PlanMealsForm {

    @NotNull
    private String productName;
}
