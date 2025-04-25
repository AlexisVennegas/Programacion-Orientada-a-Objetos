package com.proyectoClase.claseBasicoSeguridad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoClase.claseBasicoSeguridad.entities.Region;


public interface RegionRepository extends JpaRepository<Region,Integer> {
}
