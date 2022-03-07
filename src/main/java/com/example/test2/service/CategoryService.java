package com.example.test2.service;

import com.example.test2.model.Product;

import java.util.List;

public interface CategoryService {
    Product saveProduct(Product product);
    List<Product> getAll();
    Product getProductById(int id);
    Product updateProduct(Product product, int id);
    void deleteProduct(int id);
}
