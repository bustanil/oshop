package org.inharmonia.oshop.web.controller;

import org.inharmonia.oshop.core.domain.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/item")
public class ItemController {

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("products", Products.getAllProducts());
        return "item/index";
    }

}
