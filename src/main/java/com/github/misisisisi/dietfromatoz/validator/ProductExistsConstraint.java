package com.github.misisisisi.dietfromatoz.validator;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target( FIELD)
@Constraint(validatedBy= ProductExistsConstraintValidator.class)
public @interface ProductExistsConstraint {
    String message() default "Product already exists";
    Class[] groups() default {};
    Class[] payload() default {};

}