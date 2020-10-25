package com.manning.cakefactory.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CakeFactoryController {

    @GetMapping("/home")
    public String showHomePage() {
        System.out.println("In here");
        return "index";
    }
}
