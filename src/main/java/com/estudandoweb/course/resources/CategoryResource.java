package com.estudandoweb.course.resources;

import com.estudandoweb.course.entities.Category;
import com.estudandoweb.course.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //A anotação @RestController permite definir um controller com características REST;
@RequestMapping(value = "/categories")
//A anotação @RequestMapping permite definir uma rota. Caso não seja informado o método HTTP da rota, ela será definida para todos os métodos.
public class CategoryResource {

    //A anotação @Autowired delega ao Spring Boot a inicialização do objeto;
    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
