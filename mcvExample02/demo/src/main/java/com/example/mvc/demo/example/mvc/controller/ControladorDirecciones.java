package com.example.mvc.demo.example.mvc.controller;


import com.example.mvc.demo.example.mvc.bussiness.ServicioDireccion;
import com.example.mvc.demo.example.mvc.common.exceptions.ServicioException;
import com.example.mvc.demo.example.mvc.entities.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@Controller
@RequestMapping("/direcciones")
public class ControladorDirecciones {
    Logger log = LoggerFactory.getLogger(ControladorDirecciones.class);


    @Autowired
    ServicioDireccion servicio;

    @GetMapping
    public String paginaDirecciones(Model model) throws ServicioException {
        log.info("[paginaDirecciones]");
        List<Direccion> direcciones = servicio.listDirecciones();
        model.addAttribute("direcciones", direcciones);
        return "direcciones";
    }

    @GetMapping("/{id}")
    public String paginaDireccion(@PathVariable(name="id") Integer id, Model model) throws ServicioException {
        log.info("[paginaDireccion]");
        log.debug("[id:"+id+"]");
        Direccion direccionUnique = servicio.conseguirDireccion(id);
        model.addAttribute("direcciondata", direccionUnique);
        return "direccion";
    }

    @PostMapping
    public String crearDireccion(@ModelAttribute Direccion direccion, Model model) {
        log.info("[crearDireccion]");
        log.debug("[direccion:"+direccion.toString()+"]");
        direccion = servicio.grabarDireccion(direccion.getId(), direccion.getDireccionA(), direccion.getCodigoPostal(), direccion.getCiudad(), direccion.getProvincia(), direccion.getPaisId());  // Graba la dirección
        model.addAttribute("direcciondata", direccion);
        return "direccion"; // Devuelve la vista
    }

    @PostMapping("/modificar")
    public String modificarDireccion(@ModelAttribute Direccion direccion, Model model) throws ServicioException {
        log.info("[modificarDireccion]");
        log.debug("[direccion:"+direccion.toString()+"]");
        Direccion direccionAux = servicio.grabarDireccion(direccion);
        model.addAttribute("direcciondata", direccionAux);
        return "direccion"; // Devuelve la vista
    }

}
