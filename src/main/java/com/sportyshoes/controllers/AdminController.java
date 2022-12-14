package com.sportyshoes.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.sportyshoes.model.Product;
import com.sportyshoes.model.PurchaseReport;
import com.sportyshoes.model.User;
import com.sportyshoes.repositories.ProductRepository;
import com.sportyshoes.repositories.PurchaseRepo;
import com.sportyshoes.repositories.UserRepository;

@RestController
public class AdminController {
    @Autowired
    ProductRepository repo;

    @Autowired
    UserRepository urepo;

    @Autowired
    PurchaseRepo prepo;

    @RequestMapping("/admin")
    @ResponseBody
    public String admin() {
        return " Welcome to Sport Shoes, Admin ";
    }

    @GetMapping("/admin/getProduct/{pid}")
    public Optional<Product> getProductById(@RequestParam("pid") int id) {
        return repo.findById(id);
    }

    @GetMapping("/admin/getProducts")
    public List<Product> getProducts() {
        return repo.findAll();
    }

    @PostMapping("/admin/addProduct")
    public Product addProduct(Product product) {
        repo.save(product);
        return product;
    }

    @GetMapping("/admin/getUser/{uid}")
    public Optional<User> getUsersById(@RequestParam("uid") int id) {
        return urepo.findById(id);
    }

    @GetMapping("/admin/getUsers")
    public List<User> getUsers() {
        return urepo.findAll();
    }

    @GetMapping("/admin/products")
    public List<Product> showProducts() {
        return repo.findAll();
    }

    @GetMapping("/admin/getProductsByCategory")
    public List<Product> getProductsByCategory(@RequestParam String category) {
        return repo.findAllByCategory(category);
    }

    @GetMapping("/admin/purchasereport")
    public List<PurchaseReport> getPurchaseReport() {
        return prepo.findAll();
    }

    @GetMapping("/admin/purchasereportbydate/{date}")
    public List<PurchaseReport> getPurchaseReportByDate(@RequestParam("date") String date) {
        return prepo.findAllByDateofpurchase(date);
    }
}
