package com.feelingSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.feelingSpring.entity.*;

// TODO 我们习惯这个目录叫repository

public interface CategoryDAO extends JpaRepository<Category, Integer> {

    @Query(nativeQuery = true, value = "select * from category_ limit 2")
    List<Category> findAllByNativeQuery();
}