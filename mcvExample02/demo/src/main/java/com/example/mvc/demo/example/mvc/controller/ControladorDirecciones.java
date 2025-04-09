package com.example.mvc.demo.example.mvc.controller;


import com.example.mvc.demo.example.mvc.bussiness.ServicioDireccion;
import com.example.mvc.demo.example.mvc.entities.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/direcciones")
public class ControladorDirecciones {

    @Autowired
    ServicioDireccion servicio;

    @GetMapping
    public String paginaDirecciones(Model model) {

        List<Direccion> direcciones = servicio.listDirecciones();
        model.addAttribute("direcciones", direcciones);
        return "direcciones";
    }

    @GetMapping("/{id}")
    public String paginaDireccion(@PathVariable(name="id") Integer id, Model model) {
        Direccion direccionUnique = servicio.conseguirDireccion(id);  // Busca la dirección por id
        model.addAttribute("direcciondata", direccionUnique);  // Añade la dirección al modelo
        return "direccion";
    }

    @PostMapping
    public String crearDireccion(@ModelAttribute Direccion direccion, Model model) {
        direccion = servicio.grabarDireccion(direccion.getId(), direccion.getDireccionA(), direccion.getCodigoPostal(), direccion.getCiudad(), direccion.getProvincia(), direccion.getPaisId());  // Graba la dirección


        model.addAttribute("direcciondata", direccion);  // Añade la dirección al modelo
        return "direccion"; // Devuelve la vista
    }

    @PostMapping("/modificar")
    public String modificarDireccion(@ModelAttribute Direccion direccion, Model model) {
        Direccion direccionAux = servicio.grabarDireccion(direccion);
        model.addAttribute("direcciondata", direccionAux);  // Añade la dirección al modelo
        return "direccion"; // Devuelve la vista
    }

}
