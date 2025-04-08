package com.example.mvc.demo.example.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mvc.demo.example.mvc.entities.Direccion;

public interface DireccionRepository extends JpaRepository<Direccion, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
