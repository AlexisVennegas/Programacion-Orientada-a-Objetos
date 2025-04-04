package com.example.mvc.demo.example.mvc.controller;


import com.example.mvc.demo.example.mvc.entities.Region;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.mvc.demo.example.mvc.bussiness.ServicioRegion;

import java.util.logging.Logger;

@Controller
@RequestMapping("/regiones")
public class ControladorRegiones {
    //Logger log = LoggerFactory.getLogger(ControladorRegiones.class)
    @Autowired // esto es una interfaz para guardar en context
    ServicioRegion servicio;


    @GetMapping
    public String paginaRegiones(Model model) {

        List<Region> regiones = servicio.listRegiones();

        model.addAttribute("regiones", regiones);

        return "regiones";
    }

    // con un id concreto
    @GetMapping("/{regionId}")  // La URL es: /regiones/1
    public String paginaRegion(@PathVariable(name="regionId") Integer regionId, Model model) {
        Region regionUnique = servicio.conseguirRegion(regionId);  // Busca la región por id

        model.addAttribute("region", regionUnique);  // Añade la región al modelo
        return "region";
    }
}
