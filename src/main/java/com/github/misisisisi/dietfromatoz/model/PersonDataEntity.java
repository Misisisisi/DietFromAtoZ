package com.github.misisisisi.dietfromatoz.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="persons_data")
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class PersonDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double bodyWeight;

    private int bodyHeight;

    private String activity;

    private int age;

    private String sex;

    private String aim;
    @OneToOne
    @JoinColumn(name = "person_id")
    private UserEntity user;

    public PersonDataEntity(double bodyWeight, int bodyHeight, String activity, int age, String sex, String aim) {
        bodyHeight=this.bodyHeight;
        bodyWeight=this.bodyWeight;
        activity=this.activity;
        age=this.age;
        sex=this.sex;
        aim=this.aim;
    }
}
