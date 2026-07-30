package com.demo.workshop_management_api.repositories;

import com.demo.workshop_management_api.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
