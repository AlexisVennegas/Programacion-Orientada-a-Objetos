package com.example.mvc.demo.example.mvc.bussiness;

import com.example.mvc.demo.example.mvc.common.exceptions.ServicioException;
import com.example.mvc.demo.example.mvc.entities.Departamentos;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.mvc.demo.example.mvc.repositories.DepartamentoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.mvc.demo.example.mvc.common.exceptions.CodeError;

@Service
public class ServicioDepartamentosImp implements ServicioDepartamentos{
    Logger log = LoggerFactory.getLogger(ServicioDepartamentosImp.class);

    @Autowired
    DepartamentoRepository repoDepartamento;

    @Override
    public List<Departamentos> listDepartamentos() throws ServicioException {
        log.info("[listDepartamentos]");
        List<Departamentos> departamentos;

        try {
            departamentos = repoDepartamento.findAll();
        } catch (Exception e) {
            log.error("[Error al obtener los departamentos]", e);
            throw new ServicioException(CodeError.ERROR_GENERAL, e);
        }
        return departamentos;
    }

    @Override
    public Departamentos conseguirDepartamento(Integer idDepartamento) throws ServicioException {
        log.info("[conseguirDepartamento]");
        log.debug("[idDepartamento:"+idDepartamento+"]");

        Departamentos departamentoUnique;

        try {
            departamentoUnique = repoDepartamento.findById(idDepartamento).orElse(null);
        }catch (Exception e) {
            log.error("[Error al obtener el departamento]", e);
            throw new ServicioException(CodeError.ERROR_GENERAL, e);
        }

        return departamentoUnique;

    }

    @Override
    public Departamentos grabarDepartamento(Integer id, String nombre, Integer idJefe, Integer idUbicacion) {
        log.info("[grabarDepartamento]");
        log.debug("[id:"+id+"]");

        Departamentos departamento = new Departamentos();
        departamento.setId(id);
        departamento.setNombre(nombre);
        departamento.setIdJefe(idJefe);
        departamento.setIdUbicacion(idUbicacion);

        return repoDepartamento.save(departamento);
    }

    @Override
    public Departamentos grabarDepartamento(Departamentos departamento) throws ServicioException {
        log.info("[grabarDepartamento]");
        log.debug("[departamento:"+departamento.toString()+"]");

       try {
            return repoDepartamento.save(departamento);
        } catch (Exception e) {
            log.error("[Error al grabar el departamento]", e);
            throw new ServicioException(CodeError.ERROR_GENERAL, e);
        }
    }

    @Override
    public void eliminarDepartamento(Integer idDepartamento) {

    }
}
