package com.proyectoClase.clasicoBasicoRest.repositories;

import com.proyectoClase.clasicoBasicoRest.entities.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadosRepository extends JpaRepository<Empleados, Integer> {
}
