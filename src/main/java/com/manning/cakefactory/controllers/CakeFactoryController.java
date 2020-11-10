package com.manning.cakefactory.controllers;

import java.util.List;

import com.manning.cakefactory.models.Catalog;
import com.manning.cakefactory.services.CatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CakeFactoryController {

    private CatalogService catalogService;

    @Autowired
    public CakeFactoryController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/home")
    public String showHomePage(Model model) {

        List<Catalog> catalog = catalogService.listCatalog();
        model.addAttribute("categoryA", "Cakes");
        model.addAttribute("catalog", catalog);
        return "index";
    }
}
