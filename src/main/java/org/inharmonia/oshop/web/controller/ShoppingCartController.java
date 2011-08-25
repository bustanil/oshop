package org.inharmonia.oshop.web.controller;

import org.inharmonia.oshop.core.domain.Products;
import org.inharmonia.oshop.web.domain.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCart shoppingCart;

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("shoppingCart", shoppingCart);
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


}
