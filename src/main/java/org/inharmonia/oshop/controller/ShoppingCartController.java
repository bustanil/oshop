package org.inharmonia.oshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cart")
public class ShoppingCartController {

     @RequestMapping(method = RequestMethod.GET)
     public String get(){
        return "cart/index";
     }

}
