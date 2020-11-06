package com.manning.cakefactory.controllers;

import java.util.ArrayList;
import java.util.List;

import com.manning.cakefactory.models.Catalog;
import com.manning.cakefactory.repositories.CatalogJpaRepository;
import com.manning.cakefactory.repositories.CatalogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CakeFactoryController {

    private final CatalogJpaRepository catalogJpaRepository;

    @Autowired
    public CakeFactoryController(CatalogJpaRepository catalogJpaRepository) {
        this.catalogJpaRepository = catalogJpaRepository;
    }

    @GetMapping("/home")
    public String showHomePage(Model model) {

        List<Catalog> catalog = new ArrayList<>();
        this.catalogJpaRepository.findAll().forEach(i -> catalog.add(i));
        System.out.println("Size" + catalog.size());
        model.addAttribute("categoryA", "Pastries");
        model.addAttribute("categoryB", "Cakes");
        model.addAttribute("categoryC", "Cookies");
        model.addAttribute("catalog", catalog);
        return "index";
    }
}
