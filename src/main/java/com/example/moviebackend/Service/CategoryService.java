//package com.example.moviebackend.Service;
//
//import com.example.moviebackend.Repository.CategoryRepository;
//import jdk.jfr.Category;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CategoryService {
//
//    @Autowired
//    private CategoryRepository categoryRepository;
//
//    public List<Category> getAllCategories() {
//        return categoryRepository.findAll();
//    }
//
//    public Category getCategoryById(String id) {
//        return categoryRepository.findById(id).orElse(null);
//    }
//}
