package org.inharmonia.oshop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/checkout")
public class CheckoutController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "checkout/index";
    }

}
