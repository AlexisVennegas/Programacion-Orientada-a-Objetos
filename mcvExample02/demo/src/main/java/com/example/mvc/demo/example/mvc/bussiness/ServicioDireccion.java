package com.example.mvc.demo.example.mvc.bussiness;

import java.util.List;

import com.example.mvc.demo.example.mvc.common.exceptions.ServicioException;
import com.example.mvc.demo.example.mvc.entities.Direccion;

public interface ServicioDireccion {

    List<Direccion> listDirecciones() throws ServicioException;

    Direccion conseguirDireccion(Integer idDireccion) throws ServicioException;

    Direccion grabarDireccion(Integer id, String direccionA, String codigoPostal, String ciudad, String provincia, String paisId) ;

    Direccion grabarDireccion(Direccion direccion) throws ServicioException;

    void eliminarDireccion(Integer idDireccion) ;
}
