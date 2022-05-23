package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.model.UserEntity;

public interface UserService {

    UserEntity findByName(String name);

    void saveUser(UserEntity user);
}