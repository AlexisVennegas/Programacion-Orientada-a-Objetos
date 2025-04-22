package com.proyectoClase.clasicoBasicoRest.repositories;


import com.proyectoClase.clasicoBasicoRest.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, puedes buscar regiones por nombre o cualquier otro campo
    // List<Region> findByNombre(String nombre);

}
