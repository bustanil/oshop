package org.inharmonia.oshop.jbehave;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<ShoppingCartItem> items;

    public void addItem(Product product){
        addItem(product, 1);
    }

    public boolean containsProductWithId(Long productId){
        return getItemByProductId(productId) != null;
    }


    public ShoppingCartItem getItemByProductId(Long productId) {
        for (ShoppingCartItem item : items) {
            if(productId.equals(item.getProductId())){
                return item;
            }
        }
        return null;
    }

    public void updateQuantity(Long productId, Integer quantity) {
        ShoppingCartItem item = getItemByProductId(productId);
        if(item != null){
            item.setQuantity(quantity);
        }
    }

    public void addItem(Product product, Integer quantity) {
        if(items == null){
            items = new ArrayList<ShoppingCartItem>();
        }
        ShoppingCartItem item = getItemByProductId(product.getId());
        if (item == null) {
            items.add(new ShoppingCartItem(product.getId(), quantity, product.getPrice()));
        }
        else {
            item.addQuantity(quantity);
        }
    }

    public void removeByProductId(Long id) {
        ShoppingCartItem item = getItemByProductId(id);
        if(item != null){
            items.remove(item);
        }
    }

    public boolean isEmpty() {
        return items == null || items.isEmpty();
    }
}
