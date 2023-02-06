package com.estudandoweb.course.repositories;

import com.estudandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Aqui nao precisa de annotation pois ja esta herdando JpaRepository
public interface UserRepository extends JpaRepository<User, Long> {

}