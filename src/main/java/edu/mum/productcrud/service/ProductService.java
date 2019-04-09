package edu.mum.productcrud.service;

import edu.mum.productcrud.domin.Product;
import edu.mum.productcrud.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    public Product save(Product product);
    public Product findById(String id);
    public void deleteById(String id);
    public List<Product> findAll();


}
