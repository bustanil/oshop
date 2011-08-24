package org.inharmonia.oshop.web.domain;

import java.math.BigDecimal;

public class ShoppingCartItem {
    private Long productId;
    private Integer quantity;
    private BigDecimal price;
    private String name;

    public ShoppingCartItem(Long productId, String name, Integer quantity, BigDecimal price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public ShoppingCartItem(Long productId, Integer quantity, BigDecimal price) {
        this(productId, "Test", quantity, price);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSubTotal(){
        return price.multiply(new BigDecimal(quantity));
    }
}
