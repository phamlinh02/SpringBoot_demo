package com.example.test2.controller;

import com.example.test2.model.Category;
import com.example.test2.model.Product;
import com.example.test2.persitences.CategoryResponse;
import com.example.test2.persitences.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    private ProductResponse responsePro;

    @Autowired
    private CategoryResponse responseCate;


    @GetMapping("/products")
    public String listAll(Model model) {
        List<Product> listProduct = responsePro.findAll();
        model.addAttribute("list", listProduct);
        return "product";
    }

    @GetMapping("/products/create")
    public  String createProduct(Model model){
        List<Category> listCategory = responseCate.findAll();
        return "product";
    }

}
