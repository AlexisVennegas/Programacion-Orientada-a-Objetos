package com.example.mvc.demo.example.mvc.controller;


import com.example.mvc.demo.example.mvc.bussiness.ServicioPais;
import com.example.mvc.demo.example.mvc.bussiness.ServicioRegion;
import com.example.mvc.demo.example.mvc.entities.Pais;
import com.example.mvc.demo.example.mvc.entities.Region;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/paises")
public class ControladorPaises {

    public static Logger logger = org.slf4j.LoggerFactory.getLogger(ControladorPaises.class);



    @Autowired
    ServicioPais servicio;


    @Autowired
    ServicioRegion servicioRegion;

    @GetMapping
    public String paginaPaises(Model model) {
        logger.info("[ControladorPaises] - paginaPaises");
        List<Pais> paises = servicio.listPaises();
        List<Region> regiones = servicioRegion.listRegiones();
        model.addAttribute("regionesData", regiones);
        model.addAttribute("paisesData", paises);
        return "paises";
    }
    // con un id  concreto
    @GetMapping("/{id}")  // La URL es: /paises/1
    public String paginaPais(@PathVariable(name="id") String id, Model model) {
        logger.info("[ControladorPaises] - paginaPais");
        logger.debug("[id:"+id+"]");
        Pais paisUnique = servicio.conseguirPais(id);  // Busca el país por id
        List<Region> regiones = servicioRegion.listRegiones();
        model.addAttribute("pais", paisUnique);  // Añade el país al modelo
        model.addAttribute("regionesData", regiones);
        return "pais";
    }

    @PostMapping
    public String crearPais(@Valid @ModelAttribute Pais pais, BindingResult result, Model model) {
        logger.info("[ControladorPaises] - crearPais");
        logger.debug("[pais:"+pais.toString()+"]");

        if (result.hasErrors()) {
            logger.error("[Error de validación]", result.getAllErrors());
            List<Region> regiones = servicioRegion.listRegiones();
            model.addAttribute("regionesData", regiones);
            return "paises"; // Devuelve la vista con errores
        }

        try {
            pais = servicio.grabarPais(pais.getCOUNTRY_ID(), pais.getCOUNTRY_NAME(),  pais.getRegion().getREGION_ID());  // Graba el país
            model.addAttribute("pais", pais);  // Añade el país al modelo
            return "pais"; // Devuelve la vista
        } catch (Exception e) {
            logger.error("[Error al crear el país]", e);
            model.addAttribute("error", "Error al crear el país");
            return "error"; // Devuelve una vista de error
        }

    }


    @PostMapping("/modificar")
    public String modificarPais(@Valid @ModelAttribute Pais pais, BindingResult result, Model model) {
        logger.info("[ControladorPaises] - modificarPais");
        logger.debug("[pais:"+pais.toString()+"]");


        if (result.hasErrors()) {
            logger.error("[Error de validación]", result.getAllErrors());
            List<Region> regiones = servicioRegion.listRegiones();
            model.addAttribute("regionesData", regiones);
            return "paises"; // Devuelve la vista con errores
        }

        Pais paisAux = servicio.grabarPais(pais);
        model.addAttribute("pais", paisAux);  // Añade el país al modelo
        return "pais"; // Devuelve la vista

    }
    @PostMapping("eliminar")
    public String eliminarPais(@RequestParam(name="id") String id, Model model) {
        logger.info("[ControladorPaises] - eliminarPais");
        logger.debug("[id:"+id+"]");
        servicio.eliminarPais(id);  // Elimina el país
        List<Pais> paises = servicio.listPaises();  // Obtiene la lista de países actualizada
        List<Region> regiones = servicioRegion.listRegiones();
        model.addAttribute("regionesData", regiones);
        model.addAttribute("paisesData", paises);  // Añade la lista de países al modelo
        return "paises"; // Devuelve la vista
    }

}
