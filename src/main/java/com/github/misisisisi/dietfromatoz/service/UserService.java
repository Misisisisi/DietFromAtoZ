package com.github.misisisisi.dietfromatoz.service;


import com.github.misisisisi.dietfromatoz.controller.UserDetails;
import com.github.misisisisi.dietfromatoz.model.UserEntity;

import org.springframework.transaction.annotation.Transactional;


public interface UserService {

//    UserEntity findByName(String name);
//  UserEntity findByEmail(String email);
//
//    UserEntity findById(Long id);

    @Transactional
    void saveUser(UserDetails userDetails);

   }