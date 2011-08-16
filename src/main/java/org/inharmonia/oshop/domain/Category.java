package org.inharmonia.oshop.domain;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private Long id;
    private String name;

    private List<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p){
        Preconditions.checkNotNull(p, "Product cannot be null");
        if(products == null){
            products = new ArrayList<Product>();
        }
        products.add(p);
        p.setCategory(this);
    }
}
