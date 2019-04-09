package edu.mum.productcrud.serviceImpl;

import edu.mum.productcrud.domin.Product;
import edu.mum.productcrud.repository.ProductRepository;
import edu.mum.productcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository productRepository;
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(String id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void deleteById(String id) {
        productRepository.deleteById(id);

    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }
}
