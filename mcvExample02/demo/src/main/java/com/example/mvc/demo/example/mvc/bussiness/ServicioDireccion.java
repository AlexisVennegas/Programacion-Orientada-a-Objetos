package com.example.mvc.demo.example.mvc.bussiness;

import java.util.List;
import com.example.mvc.demo.example.mvc.entities.Direccion;

public interface ServicioDireccion {


    List<Direccion> listDirecciones() ;

    Direccion conseguirDireccion(Integer idDireccion) ;

    Direccion grabarDireccion(Integer idDireccion, String nombre, Integer idRegion) ;

    Direccion grabarDireccion(Direccion direccion);

    void eliminarDireccion(Integer idDireccion) ;
}
