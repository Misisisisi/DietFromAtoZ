package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.controller.CreatePersonForm;
import com.github.misisisisi.dietfromatoz.model.PersonDataEntity;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.PersonRepository;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DefaultPersonService implements PersonService {

    private final PersonRepository personRepository;

    @Override
    @Transactional
    public void savePersonData(CreatePersonForm createPersonForm, UserEntity user) {
        personRepository.save(PersonDataEntity.builder()
                .bodyHeight(createPersonForm.getBodyHeight())
                .bodyWeight(createPersonForm.getBodyWeight())
                .activity(createPersonForm.getActivity())
                .aim(createPersonForm.getAim())
                .age(createPersonForm.getAge())
                .sex(createPersonForm.getSex())
                .user(user)
                .build());

    }
    @Override
    @Transactional
    public void updateData(CreatePersonForm createPersonForm, UserEntity user) {
        personRepository.save(PersonDataEntity.builder()
                .id(personRepository.findPersonDataEntityByUserName(user.getUsername()).getId())
                .bodyHeight(createPersonForm.getBodyHeight())
                .bodyWeight(createPersonForm.getBodyWeight())
                .activity(createPersonForm.getActivity())
                .aim(createPersonForm.getAim())
                .age(createPersonForm.getAge())
                .sex(createPersonForm.getSex())
                .user(user)
                .build());

    }

}

