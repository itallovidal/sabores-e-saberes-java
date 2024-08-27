package com.receita.api.spring.receitaapispring.controllers;


import com.receita.api.spring.receitaapispring.DTOs.RecipeDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/recipe")
public class recipeController {


    @PostMapping("create")
    public ResponseEntity<Object> createRecipe(@Valid @RequestBody RecipeDTO recipe){
        return ResponseEntity.status(201).build();
    }

    @GetMapping("all")
    public ResponseEntity<Object> getAllRecipe(@Valid @RequestBody RecipeDTO recipe){
        return ResponseEntity.status(200).build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> getRecipeById(@PathVariable("id") UUID id){
        return ResponseEntity.status(200).body(id);
    }

    @GetMapping("preparation")
    public ResponseEntity<Object> getRecipeByPrepTime(@Min(value = 5, message = "O tempo de preparação deve ter pelo menos 5 min.") @RequestParam("time") int time){
        return ResponseEntity.status(200).body(time);
    }

    @GetMapping("search")
    public ResponseEntity<Object> searchRecipe(@NotEmpty @RequestParam("q") String query){
        return ResponseEntity.status(200).body(query);
    }
}
