package com.example.test2.persitences;

import com.example.test2.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryResponse extends JpaRepository<Category, Integer> {
}
