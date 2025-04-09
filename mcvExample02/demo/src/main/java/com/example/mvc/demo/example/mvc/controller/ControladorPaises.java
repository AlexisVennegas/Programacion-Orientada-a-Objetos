package com.example.mvc.demo.example.mvc.controller;


import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.mvc.demo.example.mvc.bussiness.*;
import com.example.mvc.demo.example.mvc.entities.*;
import org.springframework.ui.Model;
import java.util.List;
import org.slf4j.Logger;

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
    public String crearPais(@ModelAttribute Pais pais, Model model) {
        logger.info("[ControladorPaises] - crearPais");
        logger.debug("[pais:"+pais.toString()+"]");
        pais = servicio.grabarPais(pais.getCOUNTRY_ID(), pais.getCOUNTRY_NAME(),  pais.getRegion().getREGION_ID());  // Graba el país
        model.addAttribute("pais", pais);  // Añade el país al modelo
        return "pais"; // Devuelve la vista
    }


    @PostMapping("/modificar")
    public String modificarPais(@ModelAttribute Pais pais, Model model) {
        logger.info("[ControladorPaises] - modificarPais");
        logger.debug("[pais:"+pais.toString()+"]");
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
