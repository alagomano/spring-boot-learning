package com.demo.workshop_management_api.services;

import com.demo.workshop_management_api.entities.Category;
import com.demo.workshop_management_api.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long categoryId){
        Optional<Category> category = categoryRepository.findById(categoryId);
        return category.get();
    }
}
