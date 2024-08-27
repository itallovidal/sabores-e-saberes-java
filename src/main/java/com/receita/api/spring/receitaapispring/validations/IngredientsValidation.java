package com.receita.api.spring.receitaapispring.validations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = IngredientsValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IngredientsValidation {

    public String message() default "Um ingrediente deve possui mais de 3 caracateres.";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
