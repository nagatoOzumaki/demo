package com.commerce.demo.Services;

import com.commerce.demo.Models.Customer;
import com.commerce.demo.Models.Order;
import com.commerce.demo.Models.Product;

import org.springframework.stereotype.Service;

@Service
public class UserService extends MainService {

    public void order_product(int product_id, int customer_id) {
        Product product = productRepository.findById(product_id).get();
        Customer customer = customerRepository.findById(customer_id).get();
        Order order = new Order(product, customer);
        orderRepository.save(order);
    }

    public Product show_product_details(int product_id) {
        return productRepository.findById(product_id).get();
    }
}
