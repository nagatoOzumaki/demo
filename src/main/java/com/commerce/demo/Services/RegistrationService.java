package com.commerce.demo.Services;

import com.commerce.demo.Models.Customer;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService extends MainService {
    public void signUp(Customer customer) {
        try {
            customer.setRole("user");
            customerRepository.save(customer);
        } catch (Exception e) {
            System.out.println("errrrrrrrrrrrrrrrrrrrrr");
        }
    }
}
