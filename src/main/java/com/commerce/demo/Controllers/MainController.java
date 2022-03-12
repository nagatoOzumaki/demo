package com.commerce.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.commerce.demo.Models.Customer;
import com.commerce.demo.Models.Order;
import com.commerce.demo.Models.Product;
import com.commerce.demo.Repositories.CustomerRepository;
import com.commerce.demo.Repositories.OrderRepository;
import com.commerce.demo.Repositories.ProductRepository;
import com.commerce.demo.Services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/site/v1")
public class MainController {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    MainService mainService;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;

    @GetMapping(value = "/home")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/products")
    public List<Product> getAllProduct() {
        return mainService.getAllProduct();
    }

    @GetMapping(value = "/product/{id}")
    public Product getOneProduct(@RequestParam int id) {
        return mainService.getOneProduct(id);
    }

    @GetMapping(value = "/category/{category}")
    public List<Product> getProductByCategory(@RequestParam int category) {
        return mainService.getProductByCategory(category);
    }

    @GetMapping(value = "/test")
    public void test() {
        Product product = productRepository.findById(5).get();
        Customer customer = customerRepository.findById(1).get();
        Order order = new Order();
        order.setCustomer(customer);
        order.addToCart(product);
        orderRepository.save(order);

    }

}
