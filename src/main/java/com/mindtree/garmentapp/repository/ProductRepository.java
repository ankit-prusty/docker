package com.mindtree.garmentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.garmentapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
