package com.estudandoweb.course.repositories;

import com.estudandoweb.course.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
