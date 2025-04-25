package com.proyectoClase.claseBasicoSeguridad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoClase.claseBasicoSeguridad.entities.Pais;


public interface PaisRepository extends JpaRepository<Pais,String> {
}
