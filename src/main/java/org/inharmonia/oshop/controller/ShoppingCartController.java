package org.inharmonia.oshop.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cart")
public class ShoppingCartController extends BaseController {

    private ApplicationContext ctx;

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("shoppingCart", getShoppingCart());
        return "cart/index";
    }

}
