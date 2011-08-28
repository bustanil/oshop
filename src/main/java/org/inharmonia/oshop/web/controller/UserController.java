package org.inharmonia.oshop.web.controller;

import org.inharmonia.oshop.web.domain.UserRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(){
        return "redirect:/item.php";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Map<String, Object> modelMap){
        modelMap.put("userRegistration", new UserRegistration());
        return "user/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid UserRegistration userRegistration, BindingResult bindingResult){
        // TODO save to database, put to session
        return "redirect:/item.php";
    }

}
