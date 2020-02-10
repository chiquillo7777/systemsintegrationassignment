package com.dsu.integrationassignment.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsu.integrationassignment.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
