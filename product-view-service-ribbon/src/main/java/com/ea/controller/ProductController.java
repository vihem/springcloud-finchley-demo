package com.ea.controller;

import com.ea.entity.Product;
import com.ea.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> ps = productService.listProduct();
        m.addAttribute("ps", ps);
        return "products";
    }
}