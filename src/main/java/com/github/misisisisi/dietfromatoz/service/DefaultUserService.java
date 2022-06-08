package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.controller.UserDetails;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


//    @Override
//    public UserEntity findByName(String name) {
//        return null;
//    }
//
//    @Override
//    public UserEntity findByEmail(String email) {
//        return null;
//    }
//
//    @Override
//    public UserEntity findById(Long id) {
//        return null;
//    }


    @Override
    @Transactional
    public void saveUser(UserDetails userDetails) {
        userRepository.save(UserEntity.builder()
                .password(passwordEncoder.encode(userDetails.getPassword()))
                .email(userDetails.getEmail())
                .lastName(userDetails.getLastName())
                .firstName(userDetails.getFirstName())
                .username(userDetails.getUsername())
                .role("User")
                .build());
    }
}
