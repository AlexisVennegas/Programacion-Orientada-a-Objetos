package com.example.mvc.demo.example.mvc.bussiness;

import java.util.List;
import com.example.mvc.demo.example.mvc.entities.Pais;


public interface ServicioPais {

    List<Pais> listPaises() ;

    Pais conseguirPais(Integer idPais) ;

    Pais grabarPais(Pais pais) ;

    void eliminarPais(Integer idPais) ;
}
