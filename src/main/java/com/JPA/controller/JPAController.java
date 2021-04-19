package com.JPA.controller;

import com.JPA.model.Product;
import com.JPA.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JPAController {

    ProductService productService;

    // constructor injection
    public JPAController(ProductService productService ){
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("products", productService.findAll());
        return "index";
    }

    //use pathvariable to map id from list on web page
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") long id, Model model){
        //tilføj Product med id til model view
        model.addAttribute("product", productService.findById(id));
        return "update";
    }

    //update product
    @PostMapping("/update")
    public String update(@ModelAttribute Product product){
        //update by using update service
        productService. update(product,product.getId());
        return "redirect:/";
    }



}
