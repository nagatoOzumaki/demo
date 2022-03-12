package com.commerce.demo.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clients")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    String email;
    @Column
    String role;
    @Column
    String firstName;
    @Column
    String lastName;
    @Column
    String password;
    @Column
    String address;
    @Column
    String post_code;
    @Column
    String city;
    @Column
    String phone;
    @OneToMany(mappedBy = "customer")
    List<Order> orders;

    public Customer() {
        // constucteur necessaire pour l insertion de la base donne
    }

    public Customer(String email, String first_name, String last_name, String password, String address,
            String post_code, String city, String phone) {
        this.email = email;
        this.firstName = first_name;
        this.lastName = last_name;
        this.password = password;
        this.address = address;
        this.post_code = post_code;
        this.city = city;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
