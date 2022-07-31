package com.sportyshoes.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.Model.Products;

@RestController
public class MainController {
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return " Welcome to Sporty Shoes ";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String admin() {
        return " Welcome to Sport Shoes, Admin ";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String user() {
        return " Welcome to Sport Shoes ";
    }

    @GetMapping("/getProducts")
    public List<Products> getProducts() {
        return Arrays.asList(new Products(1, "Shoes", "Sneakers", 2000.0),
                new Products(2, "Shoes", "Not Sneakers", 3000.0));
    }
}
