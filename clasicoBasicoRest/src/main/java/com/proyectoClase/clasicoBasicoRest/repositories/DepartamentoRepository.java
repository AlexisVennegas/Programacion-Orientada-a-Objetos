package com.proyectoClase.clasicoBasicoRest.repositories;

import com.proyectoClase.clasicoBasicoRest.entities.Departamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamentos, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
