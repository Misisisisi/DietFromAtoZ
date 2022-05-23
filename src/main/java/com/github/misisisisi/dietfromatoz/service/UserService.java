package com.github.misisisisi.dietfromatoz.service;


import com.github.misisisisi.dietfromatoz.controller.CreateUserForm;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public interface UserService {

    UserEntity findByName(String name);

    @Transactional
    void saveUser(CreateUserForm createUserForm);
}