package com.example.mvc.demo.example.mvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.mvc.demo.example.mvc.bussiness.ServicioPais;
import com.example.mvc.demo.example.mvc.entities.Pais;
import org.springframework.ui.Model;
import java.util.List;

@Controller
@RequestMapping("/paises")
public class ControladorPaises {

    @Autowired
    ServicioPais servicio;

    @GetMapping
    public String paginaPaises(Model model) {

        List<Pais> paises = servicio.listPaises();
        model.addAttribute("paisesData", paises);
        return "paises";
    }
    // con un id  concreto
    @GetMapping("/{id}")  // La URL es: /paises/1
    public String paginaPais(@PathVariable(name="id") String id, Model model) {
        Pais paisUnique = servicio.conseguirPais(id);  // Busca el país por id
        model.addAttribute("pais", paisUnique);  // Añade el país al modelo
        return "pais";
    }

    @PostMapping
    public String crearPais(@RequestParam(name="COUNTRY_ID") String id, @RequestParam(name="COUNTRY_NAME") String nombrePais, @RequestParam(name="REGION_ID") Integer idRegion, Model model) {

        Pais pais = servicio.grabarPais(id, nombrePais, idRegion);
        model.addAttribute("pais", pais);  // Añade el país al modelo
        return "pais";  // Redirige a la lista de países
    }

}
