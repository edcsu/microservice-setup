package com.ske.skeecommerce.service;

import com.ske.skeecommerce.model.Order;
import com.ske.skeecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
@Transactional
public class OrderServiceImplementation implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImplementation(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Iterable<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    @Override
    public Order create(Order order) {
        order.setDateCreated(LocalDate.now());

        return this.orderRepository.save(order);
    }

    @Override
    public void delete(Order order) {
        this.orderRepository.delete(order);
    }

    @Override
    public void update(Order order) {
        this.orderRepository.save(order);
    }
}