package com.demo.workshop_management_api.repositories;

import com.demo.workshop_management_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
