package edu.mum.productcrud.controller;

import edu.mum.productcrud.domin.Product;
import edu.mum.productcrud.repository.ProductRepository;
import edu.mum.productcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    public ProductService productService;

    @GetMapping("/createProduct")
    public String createProduct(@ModelAttribute("product")Product product){
        return "createProduct";
    }
    @PostMapping("/createProduct")
    public String saveProduct(@ModelAttribute("product") Product product){
        System.out.println(product);
        Product savedProduct = productService.save(product);
        return "redirect:/listProduct";
    }
    @GetMapping("/listProduct")
    public String getProductList(Model model){
       model.addAttribute("products",productService.findAll());
        return "listProduct";
    }
}
