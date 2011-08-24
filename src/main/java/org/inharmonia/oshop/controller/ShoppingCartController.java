package org.inharmonia.oshop.controller;

import org.inharmonia.oshop.domain.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cart")
public class ShoppingCartController extends BaseController {

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("shoppingCart", getShoppingCart());
        return "cart/index";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("pid") Long id, Model model){
        getShoppingCart().addItem(Products.getProductById(id));
        return "redirect:/cart.php";
    }

}
