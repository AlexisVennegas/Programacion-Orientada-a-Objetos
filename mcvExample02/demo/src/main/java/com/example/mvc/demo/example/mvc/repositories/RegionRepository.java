package com.example.mvc.demo.example.mvc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvc.demo.example.mvc.entities.Region;

public interface RegionRepository extends JpaRepository<Region, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, puedes buscar regiones por nombre o cualquier otro campo
    // List<Region> findByNombre(String nombre);

}
