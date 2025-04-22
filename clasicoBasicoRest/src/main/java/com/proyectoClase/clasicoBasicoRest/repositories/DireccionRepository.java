package com.proyectoClase.clasicoBasicoRest.repositories;

import com.proyectoClase.clasicoBasicoRest.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionRepository extends JpaRepository<Direccion, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
