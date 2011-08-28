package org.inharmonia.oshop.web.controller;

import org.inharmonia.oshop.core.domain.Products;
import org.inharmonia.oshop.web.domain.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCart shoppingCart;

    @RequestMapping(method = RequestMethod.GET)
    public String get(Map<String, Object> modelMap) {
        modelMap.put("shoppingCart", shoppingCart);
        return "cart/index";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("pid") Long id) {
        shoppingCart.addItem(Products.getProductById(id));
        return "redirect:/cart.php";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("pid") Long id) {
        shoppingCart.removeByProductId(id);
        return "redirect:/cart.php";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestParam Map<String, String> parameterMap){
        for (String key : parameterMap.keySet()) {
            Long productId = Long.valueOf(key.split("-")[1]);
            Integer quantity = Integer.valueOf(parameterMap.get(key));
            shoppingCart.updateQuantity(productId, quantity);
        }
        return "redirect:/cart.php";
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
