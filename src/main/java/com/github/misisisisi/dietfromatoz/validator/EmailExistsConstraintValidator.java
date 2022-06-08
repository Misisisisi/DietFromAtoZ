package com.github.misisisisi.dietfromatoz.validator;

import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailExistsConstraintValidator implements ConstraintValidator<EmailExistsConstraint, String> {

    @Autowired
    private UserRepository userRepository;

    public boolean isValid(String email, ConstraintValidatorContext arg1) {

        UserEntity findByEmail = userRepository.findUserByEmail(email);
        return (findByEmail !=null)? false:true;
    }

}
