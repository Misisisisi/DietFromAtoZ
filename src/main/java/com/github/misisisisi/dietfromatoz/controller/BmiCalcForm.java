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


    @NotNull @Positive (message = "Podaj prawidłową masę ciała")
    private double bodyWeight;
    @NotNull (message = "Podaj prawidłowy wzrost w centymetrach")
    @Min(50) @Max(250)
    private double bodyHeight;

}
