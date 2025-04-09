package com.example.mvc.demo.example.mvc.bussiness;


import com.example.mvc.demo.example.mvc.common.exceptions.CodeError;
import com.example.mvc.demo.example.mvc.common.exceptions.ServicioException;
import com.example.mvc.demo.example.mvc.entities.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mvc.demo.example.mvc.repositories.DireccionRepository;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ServicioDireccionImp implements ServicioDireccion{
    Logger log = LoggerFactory.getLogger(ServicioDireccionImp.class);

    @Autowired
    DireccionRepository repoDireccion;

    @Override
    public List<Direccion> listDirecciones() throws ServicioException {
        log.info("[listDirecciones]");
        List<Direccion> direcciones;
        try {
            direcciones = repoDireccion.findAll();
        } catch (Exception e) {
            log.error("[Error al obtener las direcciones]", e);
            throw new ServicioException(CodeError.ERROR_GENERAL, e);
        }
        return direcciones;
    }

    @Override
    public Direccion conseguirDireccion(Integer idDireccion) throws ServicioException {
        log.info("[conseguirDireccion]");
        log.debug("[idDireccion:"+idDireccion+"]");
        Direccion direccionUnique;
        try {
           direccionUnique = repoDireccion.findById(idDireccion).orElse(null);
        } catch (Exception e) {
           log.error("[Error al obtener la direccion]", e);
           throw new ServicioException(CodeError.ERROR_GENERAL, e);
        }
        return direccionUnique;
    }

    @Override
    public Direccion grabarDireccion(Integer id, String direccionA, String codigoPostal, String ciudad, String provincia, String paisId) {
        log.info("[grabarDireccion]");
        log.debug("[id:"+id+"]");
        log.debug("[direccionA:"+direccionA+"]");
        log.debug("[codigoPostal:"+codigoPostal+"]");
        log.debug("[ciudad:"+ciudad+"]");

        Direccion direccionAux = new Direccion();

        direccionAux.setId(id);
        direccionAux.setDireccion(direccionA);
        direccionAux.setCodigoPostal(codigoPostal);
        direccionAux.setCiudad(ciudad);
        direccionAux.setProvincia(provincia);
        direccionAux.setPaisId(paisId);

        return repoDireccion.save(direccionAux);

    }

    @Override
    public Direccion grabarDireccion(Direccion direccion) throws ServicioException {
        log.info("[grabarDireccion]");
        log.debug("[direccion:"+direccion.toString()+"]");


        try {
            return repoDireccion.save(direccion);
        } catch (Exception e) {
            log.error("[Error al grabar la direccion]", e);
            throw new ServicioException(CodeError.ERROR_GENERAL, e);
        }

    }

    @Override
    public void eliminarDireccion(Integer idDireccion) {
        repoDireccion.deleteById(idDireccion);
    }


}
