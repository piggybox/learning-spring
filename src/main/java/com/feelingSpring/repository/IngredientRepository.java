package com.feelingSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.feelingSpring.entity.*;


public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

    @Query(nativeQuery = true, value = "select * from ingredient limit 2")
    List<Ingredient> findAllByNativeQuery();
}