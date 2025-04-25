package com.proyectoClase.claseBasicoSeguridad.controllers.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoClase.claseBasicoSeguridad.data.Casa;

@RestController
public class CasaRestController {

    @Autowired
    Casa casa;

    @Autowired
    Casa casa2;

    @GetMapping("/casa")
    public Casa xx(){

        casa.setId(1);
        casa.setNombre("Mi casa");
        return casa;
    }

    @GetMapping("/casas")
    public List<Casa> xxx(){
        List<Casa> casas= new ArrayList<Casa>();


        casa.setId(1);
        casa.setNombre("Mi casa");

        casas.add(casa);


        casa2.setId(2);
        casa2.setNombre("Otra casa");
        casas.add(casa2);


        return casas;
    }





}
