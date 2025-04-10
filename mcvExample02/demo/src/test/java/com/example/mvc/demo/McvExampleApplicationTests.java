package com.example.mvc.demo;

import com.example.mvc.demo.example.mvc.repositories.DireccionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class McvExampleApplicationTests {


	@Autowired
	DireccionRepository repodireccion;

	@Test
	void contextLoads() {
		//first test assert
		assertNotNull(repodireccion.findAllById(null));
	}

}
