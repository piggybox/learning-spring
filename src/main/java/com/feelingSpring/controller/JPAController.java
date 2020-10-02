package com.feelingSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

import com.feelingSpring.entity.Ingredient;
import com.feelingSpring.repository.IngredientRepository;

@RestController
public class JPAController {

    @Autowired
    private IngredientRepository inRepo;

    // 查询所有记录
    @GetMapping("/queryAll")
    public List<Ingredient> queryAll() {
        List<Ingredient> list = inRepo.findAllByNativeQuery();
        return list;
    }

}