package com.example.mvc.demo.example.mvc.controller;


import com.example.mvc.demo.example.mvc.bussiness.ServicioDireccion;
import com.example.mvc.demo.example.mvc.entities.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
