package com.github.misisisisi.dietfromatoz.config;

import com.github.misisisisi.dietfromatoz.security.SpringDataUserDetailsService;
import com.github.misisisisi.dietfromatoz.service.AuthService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public AuthService authService() {
        return new AuthService();
    }
    @Bean
    public SpringDataUserDetailsService customUserDetailsService() {
        return new SpringDataUserDetailsService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authService()).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/login", "/register").permitAll()
                //DO ODKOMENTOWANIA!!!!
                 .antMatchers("/home/**", "/planMeals/**","/count_BMI/**", "/create_personData/**","/addProduct/**/**", "/data/**").authenticated()

//                .antMatchers("/personData/**").authenticated()
//                .antMatchers("/create-author").hasRole("ADMIN")
//                .antMatchers("/admin", "/admin/**").hasRole("ADMIN")
                .and()
                .csrf()
                .disable()
                .formLogin()
                .loginPage("/login") // domy??lny, adres pod kt??rym b??dzie dost??ny formularz logowania, robimy do tego kontroler, kt??ry wystawia storn?? z formularzem ALE TYLKO NA @GetMapping, nie robimy @PostMapping w og??le. Formularz ma odes??a?? ????danie POST na "/login"
                .usernameParameter("username") // domy??lny, nazwa pola w formularzu logowania dla nazwy u??ytkownika
                .passwordParameter("password") // domy??lny, nazwa pola w formularzu logowania dla has??a
//                .defaultSuccessUrl("/homepage") // strona, na kt??r?? trafi u??ytkownik, je??eli wszed?? bezpo??rednio na ??cie??k?? /login, aby si?? zalogowa??
                .defaultSuccessUrl("/home", true) // wymusza, ??e po zalogowaniu ZAWSZE trafia si?? na wskazan?? stron??.
                .and()
                .logout()
                .logoutUrl("/logout")
                .permitAll();
    }
}
