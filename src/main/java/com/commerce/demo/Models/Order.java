package com.commerce.demo.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "commades")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    Date date;
    @Column
    int total;
    @Column
    int price;

    @ManyToMany
    @JoinTable(name = "details", joinColumns = @JoinColumn(name = "O_id"), inverseJoinColumns = @JoinColumn(name = "p_id"))
    List<Product> products;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer", referencedColumnName = "id")
    Customer customer;
    @Column(name = "shipping_date")
    Date shippingDate;
    @Column(name = "is_delivered")
    boolean isDelivered;

    public Order(Product product, Customer customer) {
        this.products = new ArrayList<Product>();
        this.date = new Date();
        this.products.add(product);
        this.customer = customer;
        this.price = product.getPrice();
        this.isDelivered = false;
        this.shippingDate = new Date();

    }

    public Order() {
        this.products = new ArrayList<Product>();
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public boolean getIsDelivered() {
        return isDelivered;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsDelivered(Boolean is_delivered) {
        this.isDelivered = is_delivered;
    }

    public void setShippingDate(Date shipping_date) {
        this.shippingDate = shipping_date;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPrice() {
        return price;
    }

    public int getTotal() {
        return total;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDelivered(boolean isDelivered) {
        this.isDelivered = isDelivered;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addToCart(Product product) {
        this.products.add(product);
    }
}
