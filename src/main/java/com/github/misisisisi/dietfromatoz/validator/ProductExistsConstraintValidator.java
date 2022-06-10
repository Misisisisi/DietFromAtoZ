package com.github.misisisisi.dietfromatoz.validator;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.ProductRepository;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductExistsConstraintValidator implements ConstraintValidator<ProductExistsConstraint, String> {

    @Autowired
    private ProductRepository productRepository;
     @Autowired
    private UserRepository userRepository;

    public boolean isValid(String productName, ConstraintValidatorContext arg1) {

        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        org.springframework.security.core.userdetails.UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        UserEntity username = userRepository.findUserByUsername(userDetails.getUsername());
        String owner = username.getUsername();

        ProductEntity findByProductName = productRepository.findProductByNameAndUserName(productName, owner);
        return (findByProductName !=null)? false:true;
    }

}
