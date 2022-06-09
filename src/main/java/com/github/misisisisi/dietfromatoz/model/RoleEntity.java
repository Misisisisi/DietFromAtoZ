package com.github.misisisisi.dietfromatoz.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="roles")
@Getter
@Setter
@ToString @EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor @Builder
public class RoleEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
