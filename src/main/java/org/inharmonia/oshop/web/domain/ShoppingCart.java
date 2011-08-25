package org.inharmonia.oshop.web.domain;

import org.inharmonia.oshop.core.domain.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {

    private List<ShoppingCartItem> items;

    public ShoppingCart() {}

    public void addItem(Product product) {
        addItem(product, 1);
    }

    public boolean containsProductWithId(Long productId) {
        return getItemByProductId(productId) != null;
    }


    public ShoppingCartItem getItemByProductId(Long productId) {
        for (ShoppingCartItem item : items) {
            if (productId.equals(item.getProductId())) {
                return item;
            }
        }
        return null;
    }

    public void updateQuantity(Long productId, Integer quantity) {
        ShoppingCartItem item = getItemByProductId(productId);
        if (item != null) {
            item.setQuantity(quantity);
        }
    }

    public void addItem(Product product, Integer quantity) {
        if (items == null) {
            items = new ArrayList<ShoppingCartItem>();
        }
        ShoppingCartItem item = getItemByProductId(product.getId());
        if (item == null) {
            items.add(new ShoppingCartItem(product.getId(), product.getName(), quantity, product.getPrice()));
        } else {
            item.addQuantity(quantity);
        }
    }

    public void removeByProductId(Long id) {
        ShoppingCartItem item = getItemByProductId(id);
        if (item != null) {
            items.remove(item);
        }
    }

    public boolean isEmpty() {
        return items == null || items.isEmpty();
    }

    public List<ShoppingCartItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public BigDecimal getTotal(){
        BigDecimal total = BigDecimal.ZERO;
        for (ShoppingCartItem item : items) {
            total = total.add(item.getSubTotal());
        }
        return total;
    }
}
