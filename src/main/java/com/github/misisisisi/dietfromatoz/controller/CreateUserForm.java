package com.github.misisisisi.dietfromatoz.controller;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter @Setter @ToString(exclude = "password") @EqualsAndHashCode (of="id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class CreateUserForm {

    @Email
    private String email;
    @NotBlank @Length (min = 6)
    private String password;

}
