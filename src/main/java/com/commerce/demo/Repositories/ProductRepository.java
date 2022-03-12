package com.commerce.demo.Repositories;

import java.util.List;

import com.commerce.demo.Models.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategory(int category);

}
