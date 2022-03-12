package com.commerce.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import com.commerce.demo.Models.Customer;
import com.commerce.demo.Models.Order;
import com.commerce.demo.Models.Product;
import com.commerce.demo.Repositories.ProductRepository;
import com.commerce.demo.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/site/v1/user")
public class UserController extends MainController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/order_product/{customer_id}/{product_id}")
    public void order_product(@PathVariable int product_id, @PathVariable int customer_id) {
        userService.order_product(product_id, customer_id);

    }

    @GetMapping(value = "/show_details/{product_id}")
    public Product show_product_details(@PathVariable int product_id) {
        return userService.show_product_details(product_id)

    }

}
