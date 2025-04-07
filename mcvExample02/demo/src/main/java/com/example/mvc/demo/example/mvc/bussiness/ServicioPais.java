package com.example.mvc.demo.example.mvc.bussiness;

import java.util.List;
import com.example.mvc.demo.example.mvc.entities.Pais;


public interface ServicioPais {

    List<Pais> listPaises() ;

    Pais conseguirPais(String idPais) ;

    Pais grabarPais(String idPais, String nombre, Integer idRegion) ;

    void eliminarPais(String idPais) ;
}
