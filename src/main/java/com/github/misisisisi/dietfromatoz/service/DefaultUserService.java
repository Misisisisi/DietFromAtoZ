package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.controller.CreatePersonForm;
import com.github.misisisisi.dietfromatoz.controller.CreateUserForm;
import com.github.misisisisi.dietfromatoz.model.PersonDataEntity;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserEntity findByName(String name) {
        return null;
    }

    @Override
    @Transactional
    public void saveUser(CreateUserForm createUserForm) {
        UserEntity userEntity;
        userRepository.save(UserEntity.builder()
                .email(createUserForm.getEmail())
                .password(createUserForm.getPassword())
                .build());

    }
}
