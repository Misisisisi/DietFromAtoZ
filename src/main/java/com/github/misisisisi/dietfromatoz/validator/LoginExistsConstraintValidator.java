package com.github.misisisisi.dietfromatoz.validator;

import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import com.github.misisisisi.dietfromatoz.validator.LoginExistsConstraint;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginExistsConstraintValidator implements ConstraintValidator<LoginExistsConstraint, String> {

    @Autowired
    private UserRepository userRepository;

    public boolean isValid(String username, ConstraintValidatorContext arg1) {

        UserEntity findByUsername = userRepository.findUserByUsername(username);
        return (findByUsername !=null)? false:true;
    }

}
