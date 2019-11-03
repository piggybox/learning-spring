package com.feelingSpring.service;

import java.util.List;

import com.feelingSpring.dao.CategoryDAO;
import com.feelingSpring.pojo.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    CategoryDAO categoryDAO;

    @RequestMapping("/hello")
    public List<Category> index() throws Exception {
        return categoryDAO.findAllByNativeQuery();
    }
}