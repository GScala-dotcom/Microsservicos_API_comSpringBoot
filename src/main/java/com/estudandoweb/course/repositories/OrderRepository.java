package com.estudandoweb.course.repositories;

import com.estudandoweb.course.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

// Aqui nao precisa de annotation pois ja esta herdando JpaRepository
public interface OrderRepository extends JpaRepository<Order, Long> {

}