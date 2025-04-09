package com.example.mvc.demo.example.mvc.bussiness;

import java.util.List;
import com.example.mvc.demo.example.mvc.entities.Direccion;

public interface ServicioDireccion {

    List<Direccion> listDirecciones() ;

    Direccion conseguirDireccion(Integer idDireccion) ;

    Direccion grabarDireccion(Integer id, String direccionA, String codigoPostal, String ciudad, String provincia, String paisId) ;

    Direccion grabarDireccion(Direccion direccion);

    void eliminarDireccion(Integer idDireccion) ;
}
