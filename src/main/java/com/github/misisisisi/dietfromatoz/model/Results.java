package com.github.misisisisi.dietfromatoz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Results {

    private double resultCPM;
    private double resultEndCPM;
    private double resultPPM;
    private UserEntity owner;

}
