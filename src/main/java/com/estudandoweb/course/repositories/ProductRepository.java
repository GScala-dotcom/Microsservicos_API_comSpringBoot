package com.estudandoweb.course.repositories;

import com.estudandoweb.course.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

//// Aqui nao precisa de annotation pois ja esta herdando JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long> {
}