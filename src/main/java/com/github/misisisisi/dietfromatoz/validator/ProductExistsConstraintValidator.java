package com.github.misisisisi.dietfromatoz.validator;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.ProductRepository;
import com.github.misisisisi.dietfromatoz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductExistsConstraintValidator implements ConstraintValidator<ProductExistsConstraint, String> {

    @Autowired
    private ProductRepository productRepository;

    public boolean isValid(String productName, ConstraintValidatorContext arg1) {

        ProductEntity findByProductName = productRepository.findProductEntityByProductName(productName);
        return (findByProductName !=null)? false:true;
    }

}
