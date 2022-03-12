package com.commerce.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import com.commerce.demo.Models.Customer;
import com.commerce.demo.Models.Order;
import com.commerce.demo.Models.Product;
import com.commerce.demo.Repositories.ProductRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/site/v1/user")
public class UserController extends MainController {
    @GetMapping(value = "/order_product/{customer_id}/{product_id}")
    public void order_product(@PathVariable int product_id, @PathVariable int customer_id) {
        Product product = productRepository.findById(product_id).get();
        Customer customer = customerRepository.findById(customer_id).get();
        Order order = new Order(product, customer);
        orderRepository.save(order);

    }

    @GetMapping(value = "/show_details/{product_id}")
    public Product show_product_details(@PathVariable int product_id) {
        Product product = productRepository.findById(product_id).get();
        return product;

    }
    
}
