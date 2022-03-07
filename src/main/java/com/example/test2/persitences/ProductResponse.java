package com.example.test2.persitences;

import com.example.test2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductResponse extends JpaRepository<Product, Integer> {
}
