package org.inharmonia.oshop.controller;

import org.inharmonia.oshop.domain.ShoppingCart;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cart")
public class ShoppingCartController implements ApplicationContextAware {

    private ApplicationContext ctx;

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {
        ShoppingCart shoppingCart = ctx.getBean(ShoppingCart.class);
        model.addAttribute("shoppingCart", shoppingCart);
        return "cart/index";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }
}
