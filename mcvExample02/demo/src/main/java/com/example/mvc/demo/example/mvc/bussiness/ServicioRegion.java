package com.example.mvc.demo.example.mvc.bussiness;

import java.util.List;

import com.example.mvc.demo.example.mvc.entities.Region;

public interface ServicioRegion {

    List<Region> listRegiones() ;

    Region conseguirRegion(Integer idRegion) ;

    Region grabarRegion(Region region) ;

    void eliminarRegion(Integer idRegion) ;

}
