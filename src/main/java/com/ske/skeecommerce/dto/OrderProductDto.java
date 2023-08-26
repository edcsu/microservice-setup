package com.ske.skeecommerce.dto;

import com.ske.skeecommerce.model.Product;

public class OrderProductDto {
    private Product product;
    private Integer quantity;
    private Long customer_id;
    private Long shopping_cart_id;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getShopping_cart_id() {
        return shopping_cart_id;
    }

    public void setShopping_cart_id(Long shopping_cart_id) {
        this.shopping_cart_id = shopping_cart_id;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }
}
