package com.example.mvc.demo.example.mvc.bussiness;

import com.example.mvc.demo.example.mvc.entities.Departamentos;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.mvc.demo.example.mvc.repositories.DepartamentoRepository;

@Service
public class ServicioDepartamentosImp implements ServicioDepartamentos{


    @Autowired
    DepartamentoRepository repoDepartamento;

    @Override
    public List<Departamentos> listDepartamentos() {

        List<Departamentos> departamentos;

        departamentos = repoDepartamento.findAll();

        return departamentos;
    }

    @Override
    public Departamentos conseguirDepartamento(Integer idDepartamento) {
        return null;
    }

    @Override
    public Departamentos grabarDepartamento(Integer id, String nombre, Integer idJefe, Integer idUbicacion) {
        return null;
    }

    @Override
    public Departamentos grabarDepartamento(Departamentos departamento) {
        return null;
    }

    @Override
    public void eliminarDepartamento(Integer idDepartamento) {

    }
}
