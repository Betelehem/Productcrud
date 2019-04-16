package edu.mum.productcrud.service;

import edu.mum.productcrud.domin.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> findAll();
    public Category findById(Long id);
}
