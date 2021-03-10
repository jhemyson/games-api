package com.ecommerce.games.games.controllers;

import com.ecommerce.games.games.controllers.dto.CreateProductDto;
import com.ecommerce.games.games.entities.Category;
import com.ecommerce.games.games.entities.Product;
import com.ecommerce.games.games.repositories.CategoryRepository;
import com.ecommerce.games.games.repositories.ProductRepository;
import com.ecommerce.games.games.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("products")
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> findAll(){
        return productService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Product> create(@RequestBody Product product){
        Product createProduct = productService.create(product);

        return ResponseEntity.status(201).body(createProduct);
    }

    @RequestMapping(value = "/category",method = RequestMethod.POST)
    public Category createCategory(@RequestBody Category category){
        return categoryRepository.save(category);
    }
}
