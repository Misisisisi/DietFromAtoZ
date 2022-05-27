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
    private final UserRepository userRepository;

    @Override
    @Transactional
    public void savePersonData(CreatePersonForm createPersonForm) {
        UserEntity userEntity;
        personRepository.save(PersonDataEntity.builder()
                .bodyHeight(createPersonForm.getBodyHeight())
                .bodyWeight(createPersonForm.getBodyWeight())
                .activity(createPersonForm.getActivity())
                .aim(createPersonForm.getAim())
                .age(createPersonForm.getAge())
                .sex(createPersonForm.getSex())
//                .user(createPersonForm.getUser())
                .build());

    }
}

