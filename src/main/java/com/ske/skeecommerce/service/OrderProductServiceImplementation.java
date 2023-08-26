package com.ske.skeecommerce.service;

import com.ske.skeecommerce.model.OrderProduct;
import com.ske.skeecommerce.repository.OrderProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderProductServiceImplementation implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImplementation(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}
