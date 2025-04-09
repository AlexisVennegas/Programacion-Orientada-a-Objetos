package com.example.mvc.demo.example.mvc.repositories;

import com.example.mvc.demo.example.mvc.entities.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadosRepository extends JpaRepository<Empleados, Integer> {
}
