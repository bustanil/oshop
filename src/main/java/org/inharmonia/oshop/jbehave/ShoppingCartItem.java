package org.inharmonia.oshop.jbehave;

import java.math.BigDecimal;

public class ShoppingCartItem {
    private Long productId;
    private Integer quantity;
    private BigDecimal price;

    public ShoppingCartItem(Long productId, Integer quantity, BigDecimal price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getProductId() {
        return productId;
    }

    public void addQuantity(int i) {
        quantity += i;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
