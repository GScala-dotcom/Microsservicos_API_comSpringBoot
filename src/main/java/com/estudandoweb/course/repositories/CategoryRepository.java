package com.estudandoweb.course.repositories;

import com.estudandoweb.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//Aqui nao precisa de annotation pois ja esta herdando JpaRepository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}