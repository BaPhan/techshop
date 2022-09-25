package com.techshop.controller;

import com.techshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping()
    public String getForm(){
        System.out.println(categoryRepository.findAll());
        return "index";
    }
}
