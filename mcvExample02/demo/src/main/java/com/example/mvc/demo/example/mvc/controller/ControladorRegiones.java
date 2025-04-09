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

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@Controller
@RequestMapping("/regiones")
public class ControladorRegiones {
    Logger log = LoggerFactory.getLogger(ControladorRegiones.class);

    @Autowired // esto es una interfaz para guardar en context
    ServicioRegion servicio;


    @GetMapping
    public String paginaRegiones(Model model) {
        log.info("[paginaRegiones]");
        List<Region> regiones = servicio.listRegiones();
        model.addAttribute("regiones", regiones);
        return "regiones";
    }

    // con un id concreto
    @GetMapping("/{regionId}")
    public String paginaRegion(@PathVariable(name="regionId") Integer regionId, Model model) {
        log.info("[paginaRegion]");
        log.debug("[regionId:"+regionId+"]");
        Region regionUnique = servicio.conseguirRegion(regionId);
        model.addAttribute("region", regionUnique);
        return "region";
    }
}
