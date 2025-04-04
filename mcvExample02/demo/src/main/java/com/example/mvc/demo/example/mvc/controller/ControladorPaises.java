package com.example.mvc.demo.example.mvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
