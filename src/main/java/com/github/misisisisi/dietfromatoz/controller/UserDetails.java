package com.github.misisisisi.dietfromatoz.controller;

import com.github.misisisisi.dietfromatoz.validator.EmailExistsConstraint;
import com.github.misisisisi.dietfromatoz.validator.LoginExistsConstraint;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString(exclude = "password")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDetails {

    @NotBlank (message = "Podaj imię")
    private String firstName;
    @NotBlank (message = "Podaj nazwisko")
    private String lastName;
    @Email @NotBlank (message = "Podaj prawidłowy email")
    @EmailExistsConstraint (message = "Podany email jest już zarejestrowany")
    private String email;
    @Size(min = 8, max = 20, message = "Hasło musi mieć minimum 8 znaków")
    private String password;
    @NotBlank (message = "Podaj login")
    @LoginExistsConstraint (message = "Login zajęty")
    private String username;

    private String role;

}
