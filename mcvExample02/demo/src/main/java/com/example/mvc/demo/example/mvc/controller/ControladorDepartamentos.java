package com.example.mvc.demo.example.mvc.controller;


import com.example.mvc.demo.example.mvc.entities.Departamentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.mvc.demo.example.mvc.bussiness.ServicioDepartamentos;
import java.util.List;

@Controller
@RequestMapping("/departamentos")
public class ControladorDepartamentos {

    @Autowired
    ServicioDepartamentos servicio;

    @GetMapping
    public String paginaDepartamentos(Model model) {
        List<Departamentos> departamentos = servicio.listDepartamentos();

        model.addAttribute("departamentosData", departamentos);
        return "departamentos";
    }
}
