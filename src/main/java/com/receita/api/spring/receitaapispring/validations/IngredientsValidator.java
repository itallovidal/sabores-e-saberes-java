package com.receita.api.spring.receitaapispring.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;
import java.util.stream.Stream;

public class IngredientsValidator implements ConstraintValidator< IngredientsValidation, List<String>> {

    @Override
    public boolean isValid(List<String> ingredientList, ConstraintValidatorContext constraintValidatorContext) {
        Stream<String> invalidIngredients =  ingredientList.stream().filter((ingredient)-> ingredient.length() < 3 );
        return invalidIngredients.toList().isEmpty();
    }
}
