package com.demo.workshop_management_api.repositories;

import com.demo.workshop_management_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UseRepository extends JpaRepository<User, Long> {
}
