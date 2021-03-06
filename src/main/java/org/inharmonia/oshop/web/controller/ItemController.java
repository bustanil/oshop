package org.inharmonia.oshop.web.controller;

import org.inharmonia.oshop.core.domain.Products;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/item")
public class ItemController {

    @RequestMapping(method = RequestMethod.GET)
    public String get(Map<String, Object> model) {
        model.put("products", Products.getAllProducts());
        return "item/index";
    }

}
