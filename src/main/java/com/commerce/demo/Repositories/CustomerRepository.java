package com.commerce.demo.Repositories;

import java.util.List;

import com.commerce.demo.Models.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByEmail(String email);
}
