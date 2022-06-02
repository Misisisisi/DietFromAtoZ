package com.github.misisisisi.dietfromatoz.controller;

import lombok.*;

import javax.validation.constraints.Email;

@Getter
@Setter
@ToString(exclude = "password")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginForm {

    @Email
    private String email;
    private String password;
}
