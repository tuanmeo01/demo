package com.ptit.demo.service;

import com.ptit.demo.model.Ingredient;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IngredientService {
    List<Ingredient> getList();

    Ingredient create(Ingredient ingredient);

    void delete(Long id);

    Ingredient update(Ingredient ingredient);
}
