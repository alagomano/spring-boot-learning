package com.demo.workshop_management_api.services;

import com.demo.workshop_management_api.entities.Order;
import com.demo.workshop_management_api.entities.User;
import com.demo.workshop_management_api.repositories.OrderRepository;
import com.demo.workshop_management_api.repositories.UseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long orderId){
        Optional<Order> user = orderRepository.findById(orderId);
        return user.get();
    }
}
