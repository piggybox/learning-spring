package com.feelingSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feelingSpring.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

}