package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.controller.CreatePersonForm;
import com.github.misisisisi.dietfromatoz.model.PersonDataEntity;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface PersonService {

//    void savePersonData (PersonDataEntity personData);

    @Transactional
    void savePersonData(CreatePersonForm createPersonForm, UserEntity user);

    @Transactional
    void updateData(CreatePersonForm createPersonForm, UserEntity user);
}
