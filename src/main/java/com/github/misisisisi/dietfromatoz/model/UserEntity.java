package com.github.misisisisi.dietfromatoz.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name="users")
@Getter @Setter @ToString (exclude = "password") @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class UserEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 20)
    private String username;
    @Column(nullable = false)
    private String password;
    @Email
    @Column(nullable = false, unique = true, length = 30)
    private String email;

    private String firstName;

    private String lastName;

    private String role;

    @OneToOne (mappedBy = "user")
    private PersonDataEntity person;

}
