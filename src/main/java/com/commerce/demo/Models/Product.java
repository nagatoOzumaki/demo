package com.commerce.demo.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "produits")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    String name;
    @Column
    String description;
    @Column
    String image1;
    @Column
    String image2;
    @Column
    String image3;
    @Column
    int price;
    @Column
    int stock;
    @Column
    int category;
    @ManyToMany(mappedBy = "products")
    List<Order> orders;

    public Product() {
    }

    public int getCategory() {
        return category;
    }

    public Product(int id, String name, String description, String image1, String image2, String image3, int price,
            int stock, int category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getImage1() {
        return image1;
    }

    public String getImage2() {
        return image2;
    }

    public String getImage3() {
        return image3;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
