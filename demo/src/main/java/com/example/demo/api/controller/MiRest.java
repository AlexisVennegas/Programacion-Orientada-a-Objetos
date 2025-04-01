package com.example.demo.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class MiRest {

	@GetMapping
	public String getString() {
		return "holamundo get";
	}
	
	
	@PostMapping
	public String postString() {
		return "holamundo post";
	}

	@PutMapping
	public String putString() {
		return "holamundo put";
	}

	@DeleteMapping
	public String deleteString() {
		return "holamundo Delete";
	}
	
	
	
}
