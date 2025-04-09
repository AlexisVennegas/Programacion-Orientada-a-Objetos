package com.example.mvc.demo.example.mvc.controller;


import com.example.mvc.demo.example.mvc.common.exceptions.ServicioException;
import com.example.mvc.demo.example.mvc.entities.Departamentos;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.mvc.demo.example.mvc.bussiness.ServicioDepartamentos;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@Controller
@RequestMapping("/departamentos")
public class ControladorDepartamentos {
    Logger log = LoggerFactory.getLogger(ControladorDepartamentos.class);


    @Autowired
    ServicioDepartamentos servicio;

    @GetMapping
    public String paginaDepartamentos(Model model) throws ServicioException {
        log.info("[paginaDepartamentos]");
        List<Departamentos> departamentos = servicio.listDepartamentos();
        model.addAttribute("departamentosData", departamentos);
        return "departamentos";
    }
    @GetMapping("/{id}")
    public String paginaDepartamento(@PathVariable(name="id") Integer id, Model model) throws ServicioException {
        log.info("[paginaDepartamento]");
        log.debug("[id:"+id+"]");
        Departamentos departamentoUnique = servicio.conseguirDepartamento(id);
        model.addAttribute("departamento", departamentoUnique);
        return "departamento";
    }
    @PostMapping
    public String crearDepartamento(@ModelAttribute Departamentos departamento, Model model){
        log.info("[crearDepartamento]");
        log.debug("[departamento:"+departamento.toString()+"]");
        departamento = servicio.grabarDepartamento(departamento.getId(), departamento.getNombre(), departamento.getIdJefe(),departamento.getIdUbicacion());  // Graba el departamento
        model.addAttribute("departamento", departamento);
        return "departamento"; // Devuelve la vista
    }
    @PostMapping("/modificar")
    public String modificarDepartamento(@ModelAttribute Departamentos departamento, Model model) throws ServicioException {
        log.info("[modificarDepartamento]");
        log.debug("[departamento:"+departamento.toString()+"]");
        Departamentos departamentoAux = servicio.grabarDepartamento(departamento);
        model.addAttribute("departamento", departamentoAux);
        return "departamento";
    }
}
