package com.example.mvc.demo.example.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mvc.demo.example.mvc.entities.Departamentos;

public interface DepartamentoRepository extends JpaRepository<Departamentos, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
