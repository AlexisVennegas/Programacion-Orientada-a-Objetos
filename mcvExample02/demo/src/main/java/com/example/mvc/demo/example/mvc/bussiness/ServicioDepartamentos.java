package com.example.mvc.demo.example.mvc.bussiness;

import java.util.List;

import com.example.mvc.demo.example.mvc.common.exceptions.ServicioException;
import com.example.mvc.demo.example.mvc.entities.Departamentos;

public interface ServicioDepartamentos {

    List<Departamentos> listDepartamentos() throws ServicioException;

    Departamentos conseguirDepartamento(Integer idDepartamento) throws ServicioException;

    Departamentos grabarDepartamento(Integer id, String nombre, Integer idJefe, Integer idUbicacion);

    Departamentos grabarDepartamento(Departamentos departamento) throws ServicioException;

    void eliminarDepartamento(Integer idDepartamento);
}
