package edu.mum.productcrud.repository;

import edu.mum.productcrud.domin.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,String> {
}
