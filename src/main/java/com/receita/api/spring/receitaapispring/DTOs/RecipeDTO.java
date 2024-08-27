package com.receita.api.spring.receitaapispring.DTOs;
import com.receita.api.spring.receitaapispring.validations.IngredientsValidation;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Data
public class RecipeDTO {
    @NotEmpty(message = "A receita precisa ter nome.")
    @Length(min = 4, message = "O nome da receita precisa de pelo menos 4 caracteres.")
    String name;

    @NotEmpty(message = "A receita precisa ter descrição.")
    @Length(min = 4, message = "A descrição da receita precisa de pelo menos 4 caracteres.")
    String description;

    @NotEmpty(message = "A receita precisa ter pelo menos um ingrediente.")
    @IngredientsValidation
    List<String> ingredients;
}
