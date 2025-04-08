package com.example.mvc.demo.example.mvc.bussiness;

import java.util.List;
import com.example.mvc.demo.example.mvc.entities.Departamentos;

public interface ServicioDepartamentos {

    List<Departamentos> listDepartamentos();

    Departamentos conseguirDepartamento(Integer idDepartamento);

    Departamentos grabarDepartamento(Integer id, String nombre, Integer idJefe, Integer idUbicacion);

    Departamentos grabarDepartamento(Departamentos departamento);

    void eliminarDepartamento(Integer idDepartamento);
}
