package com.example.mvc.demo.example.mvc.controller;

import com.example.mvc.demo.example.mvc.bussiness.ServicioEmpleados;
import com.example.mvc.demo.example.mvc.entities.Empleados;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.List;

@Controller
@RequestMapping("/empleados")
public class ControladorEmpleados {
    Logger log = LoggerFactory.getLogger(ControladorEmpleados.class);


    @Autowired
    ServicioEmpleados servicioEmpleados;

    @GetMapping
    public String paginaEmpleados(Model model) {
        log.info("[paginaEmpleados]");
        List<Empleados> empleados = servicioEmpleados.listEmpleados();
        model.addAttribute("empleadosData", empleados);
        return "empleados";
    }
    @GetMapping("{id}")
    public String paginaEmpleado(@PathVariable(name="id") Integer id, Model model) {
        log.info("[paginaEmpleado]");
        log.debug("[id:"+id+"]");
        Empleados empleadoUnique = servicioEmpleados.conseguirEmpleado(id);
        model.addAttribute("empleadoData", empleadoUnique);
        return "empleado";
    }
    @PostMapping
    public String crearEmpleado(@ModelAttribute Empleados empleado, Model model) {
        log.info("[crearEmpleado]");
        log.debug("[empleado:"+empleado.toString()+"]");
        empleado = servicioEmpleados.grabarEmpleado(empleado.getId(), empleado.getNombre(), empleado.getApellido(), empleado.getEmail(), empleado.getTelefono(), empleado.getFechaContratacion(), empleado.getIdTrabajo(), empleado.getSalario(), empleado.getComision(), empleado.getIdJefe(), empleado.getIdDepartamento());
        model.addAttribute("empleadoData", empleado);
        return "empleado";
    }
    @PostMapping("/modificar")
    public String modificarEmpleado(@ModelAttribute Empleados empleado, Model model) {
        log.info("[modificarEmpleado]");
        log.debug("[empleado:"+empleado.toString()+"]");
        Empleados empleadoAux = servicioEmpleados.grabarEmpleado(empleado);
        model.addAttribute("empleadoData", empleadoAux);
        return "empleado";
    }

}

