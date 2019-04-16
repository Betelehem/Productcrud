package edu.mum.productcrud.controller;

import edu.mum.productcrud.domin.Category;
import edu.mum.productcrud.domin.Product;
import edu.mum.productcrud.repository.ProductRepository;
import edu.mum.productcrud.service.CategoryService;
import edu.mum.productcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    public ProductService productService;

    @Autowired
    public CategoryService categoryService;

    @GetMapping("/createProduct")
    public String createProduct(@ModelAttribute("product")Product product, Model model){
//        List<Category> categories = new ArrayList<>();
//        categories.add(new Category(1L, "Electronics"));
//        categories.add(new Category(2L, "Clothes"));
//        categories.add(new Category(3L, "Shoes"));
//        model.addAttribute("categories", categories);

        model.addAttribute("categories", categoryService.findAll());
        return "createProduct";
    }

    @PostMapping("/createProduct")
    public String saveProduct(@ModelAttribute("product") Product product){
        System.out.println("cat object: " + product.getCategory());
        Long catId = product.getCategory().getId();
//        Category category = categoryService.findById(catId);
//        product.setCategory(category);

        //product.setCategory(categoryService.findById(catId));
        Product savedProduct = productService.save(product);
        return "redirect:/listProduct";
    }

    @GetMapping("/listProduct")
    public String getProductList(Model model){
       model.addAttribute( "products",productService.findAll());
        return "listProduct";
    }

    @GetMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") String prodId, Model model){
        Product produ = productService.findById(prodId);
        model.addAttribute("product",produ);
        model.addAttribute("categories", categoryService.findAll());

        return "createProduct";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") String prodId){
        productService.deleteById(prodId);

        return "redirect:/listProduct";
    }
}
