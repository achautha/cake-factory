package com.manning.cakefactory.controllers;

import java.util.Arrays;
import java.util.List;

import com.manning.cakefactory.models.Cake;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CakeFactoryController {

    @GetMapping("/home")
    public String showHomePage(Model model) {

        List<Cake> cakes = Arrays.asList(new Cake("Chocolate", "1.0", "Dark chocolate cake"),
                new Cake("Vanilla", "0.5", "Delicious vanilla cake"),
                new Cake("Strawberry", "0.5", "Yummy strawberry cake"),
                new Cake("Pineapple", "1.5", "Awesome pinapple cake"), new Cake("Mango", "3.5", "King cake"),
                new Cake("Cheese", "3.5", "Cheese overload"));

        model.addAttribute("categoryA", "Pastries");
        model.addAttribute("categoryB", "Cakes");
        model.addAttribute("categoryC", "Cookies");
        model.addAttribute("cakes", cakes);
        return "index";
    }
}
