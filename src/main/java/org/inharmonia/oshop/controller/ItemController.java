package org.inharmonia.oshop.controller;

import org.inharmonia.oshop.domain.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/item")
public class ItemController extends BaseController {

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("products", Products.getAllProducts());
        return "item/index";
    }

}
