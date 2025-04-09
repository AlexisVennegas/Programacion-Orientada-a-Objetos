package com.example.mvc.demo.example.mvc.controller;


import com.example.mvc.demo.example.mvc.entities.Departamentos;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/{id}")
    public String paginaDepartamento(@PathVariable(name="id") Integer id, Model model) {
        Departamentos departamentoUnique = servicio.conseguirDepartamento(id);  // Busca el departamento por id
        model.addAttribute("departamento", departamentoUnique);  // Añade el departamento al modelo
        return "departamento";
    }
    @PostMapping
    public String crearDepartamento(@ModelAttribute Departamentos departamento, Model model){
        departamento = servicio.grabarDepartamento(departamento.getId(), departamento.getNombre(), departamento.getIdJefe(),departamento.getIdUbicacion());  // Graba el departamento
        model.addAttribute("departamento", departamento);  // Añade el departamento al modelo
        return "departamento"; // Devuelve la vista
    }
    @PostMapping("/modificar")
    public String modificarDepartamento(@ModelAttribute Departamentos departamento, Model model) {
        Departamentos departamentoAux = servicio.grabarDepartamento(departamento);
        model.addAttribute("departamento", departamentoAux);  // Añade el departamento al modelo
        return "departamento"; // Devuelve la vista
    }
}
