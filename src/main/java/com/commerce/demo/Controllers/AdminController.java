package com.commerce.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.websocket.server.PathParam;

import com.commerce.demo.Models.Product;
import com.commerce.demo.Services.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping(value = "/site/v1/admin")
public class AdminController extends MainController {
    @Autowired
    AdminService adminService;

    @PostMapping(value = "/add_product")
    public void addProduct(@RequestBody Product product) {
        adminService.addProduct(product);
    }

    @GetMapping(value = "/remove_product/{id}")
    public void removeProduct(@PathVariable int id) {
        adminService.removeProduct(id);
    }

    @GetMapping(value = "/deliver_order/{id}")
    public void deliver(@PathVariable int id) {
        adminService.deliverOrder(id);
    }

}
