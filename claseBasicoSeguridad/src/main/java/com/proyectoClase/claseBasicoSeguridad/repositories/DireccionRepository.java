package com.proyectoClase.claseBasicoSeguridad.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.proyectoClase.claseBasicoSeguridad.entities.Direccion;


public interface DireccionRepository extends JpaRepository<Direccion,Integer> {

    List<Direccion> findAllByPais_Id(@Param("id") String idPais);
}
