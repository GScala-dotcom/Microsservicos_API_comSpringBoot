package com.estudandoweb.course.resources;

import com.estudandoweb.course.services.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudandoweb.course.entities.User;

import java.util.List;

@RestController //A anotação @RestController permite definir um controller com características REST;
@RequestMapping(value = "/users")
//A anotação @RequestMapping permite definir uma rota. Caso não seja informado o método HTTP da rota, ela será definida para todos os métodos.
public class UserResource {

	//A anotação @Autowired delega ao Spring Boot a inicialização do objeto;
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}