package com.commerce.demo.Services;

import java.util.List;

import com.commerce.demo.Models.*;
import com.commerce.demo.Repositories.CustomerRepository;
import com.commerce.demo.Repositories.OrderRepository;
import com.commerce.demo.Repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Product getOneProduct(int id) {
        return productRepository.findById(id).get();
    }

    public List<Product> getProductByCategory(int category) {
        return productRepository.findByCategory(category);
    }
}
