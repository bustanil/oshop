package org.inharmonia.oshop.core.domain;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Products {

    private static List<Product> products;

    static {
        products = new ArrayList<Product>();
        products.add(new Product(1L, "Product 1", "Description 1", new BigDecimal(100000.0), null));
        products.add(new Product(2L, "Product 2", "Description 2", new BigDecimal(200000.0), null));
        products.add(new Product(3L, "Product 3", "Description 3", new BigDecimal(300000.0), null));
        products.add(new Product(4L, "Product 4", "Description 4", new BigDecimal(400000.0), null));
        products.add(new Product(5L, "Product 5", "Description 5", new BigDecimal(500000.0), null));
        products.add(new Product(6L, "Product 6", "Description 6", new BigDecimal(600000.0), null));
        products.add(new Product(7L, "Product 7", "Description 7", new BigDecimal(700000.0), null));
        products.add(new Product(8L, "Product 8", "Description 8", new BigDecimal(800000.0), null));
    }

    public static List<Product> getAllProducts(){
        return products;
    }

    public static Product getProductById(Long id) {
        for (Product product : products) {
            if(product.getId().equals(id)){
                return product;
            }
        }
        throw new RuntimeException("Cannot find product with id: " + id);
    }
}
