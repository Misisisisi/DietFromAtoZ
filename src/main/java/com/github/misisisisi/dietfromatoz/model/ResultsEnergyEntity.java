package com.github.misisisisi.dietfromatoz.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="resultEnergy")
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor @Builder
public class ResultsEnergyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double resultCPM;
    private double resultEndCPM;
    private double resultPPM;
    @ManyToOne
    private UserEntity owner;

}
