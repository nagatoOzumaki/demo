package com.commerce.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.NoSuchElementException;

import com.commerce.demo.ExceptionHandling.BaseExceptionHandler;
import com.commerce.demo.ExceptionHandling.CustomisedExceptionHandler;
import com.commerce.demo.Models.Product;
import com.commerce.demo.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<Product> show_product_details(@PathVariable int product_id) {

        try {
            Product product = userService.show_product_details(product_id);
            return new ResponseEntity(product, HttpStatus.OK);
        } catch (RuntimeException ex) {
            throw ex;
        }

    }

}
