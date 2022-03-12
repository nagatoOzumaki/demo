package com.commerce.demo.Repositories;

import com.commerce.demo.Models.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
