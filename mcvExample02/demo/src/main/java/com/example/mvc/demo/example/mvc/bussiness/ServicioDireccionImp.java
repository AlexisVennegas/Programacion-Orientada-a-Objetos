package com.example.mvc.demo.example.mvc.bussiness;


import com.example.mvc.demo.example.mvc.entities.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mvc.demo.example.mvc.repositories.DireccionRepository;

import java.util.List;


@Service
public class ServicioDireccionImp implements ServicioDireccion{

    @Autowired
    DireccionRepository repoDireccion;


    @Override
    public List<Direccion> listDirecciones() {

        List<Direccion> direcciones;

        direcciones = repoDireccion.findAll();


        return direcciones;


    }

    @Override
    public Direccion conseguirDireccion(Integer idDireccion) {
        Direccion direccionUnique;

       try {
           direccionUnique = repoDireccion.findById(idDireccion).orElse(null);
       } catch (Exception e) {
              e.printStackTrace();
              throw new RuntimeException("Error al obtener la dirección");
         }

        return direccionUnique;
    }

    @Override
    public Direccion grabarDireccion(Integer idDireccion, String nombre, Integer idRegion) {
        return null;
    }

    @Override
    public Direccion grabarDireccion(Direccion direccion) {
        return null;
    }

    @Override
    public void eliminarDireccion(Integer idDireccion) {

    }


}
