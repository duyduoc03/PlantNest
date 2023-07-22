package com.example.leduyduoc_examp.controller;

import com.example.leduyduoc_examp.entity.Product;
import com.example.leduyduoc_examp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public String getAll(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "list-product";
    }
    @GetMapping("/{id}")
    public String getById(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "product-detail";
    }

}
