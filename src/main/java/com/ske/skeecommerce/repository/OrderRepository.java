package com.ske.skeecommerce.repository;

import com.ske.skeecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
