package com.github.misisisisi.dietfromatoz.controller;

import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor @Builder
public class BmiCalcForm {


    @NotNull @Positive
    private double bodyWeight;
    @NotNull @Min(50) @Max(250)
    private double bodyHeight;

}
