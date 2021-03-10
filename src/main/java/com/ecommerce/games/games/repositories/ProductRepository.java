package com.ecommerce.games.games.repositories;

import com.ecommerce.games.games.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
