package com.ecommerce.games.games.services;

import com.ecommerce.games.games.entities.Category;
import com.ecommerce.games.games.entities.Product;
import com.ecommerce.games.games.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product findById(Long id){
        Optional<Product> product = productRepository.findById(id);

        return product.orElse(null);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product create(Product product){
        return productRepository.save(product);
    }

}
