package com.demo.workshop_management_api.repositories;

import com.demo.workshop_management_api.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
