package com.ske.skeecommerce.repository;

import com.ske.skeecommerce.model.OrderProduct;
import com.ske.skeecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
