package com.commerce.demo.Services;

import com.commerce.demo.Models.Order;
import com.commerce.demo.Models.Product;
import com.commerce.demo.Repositories.OrderRepository;

import org.springframework.stereotype.Service;

@Service
public class AdminService extends MainService {

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void removeProduct(int id) {
        productRepository.deleteById(id);

    }

    public boolean isOrderDelivered(int id) {
        return orderRepository.existsById(id);

    }

    public void deliverOrder(int id) {

        Order order = orderRepository.findById(id).get();
        orderRepository.delete(order);
        order.setIsDelivered(true);
        orderRepository.save(order);

    }

}
