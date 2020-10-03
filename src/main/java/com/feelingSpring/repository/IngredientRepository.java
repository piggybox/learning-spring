package com.feelingSpring.repository;

import java.util.List;

import com.feelingSpring.entity.Ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    @Nullable
    @Query(nativeQuery = true, value = "select * from test.ingredient")
    List<Ingredient> findAllByNativeQuery();
}