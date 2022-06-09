package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.controller.UserDetails;
import com.github.misisisisi.dietfromatoz.model.RoleEntity;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public UserEntity findByName(String name) {
        return userRepository.findUserByUsername(name);
    }

    @Override
    @Transactional
    public void saveUser(UserDetails userDetails) {
        userRepository.save(UserEntity.builder()
                .password(passwordEncoder.encode(userDetails.getPassword()))
                .email(userDetails.getEmail())
                .lastName(userDetails.getLastName())
                .firstName(userDetails.getFirstName())
                .username(userDetails.getUsername())
                .roles(Set.of(RoleEntity.builder()
                        .name("User")
                        .build()))
                .build());
    }

}
