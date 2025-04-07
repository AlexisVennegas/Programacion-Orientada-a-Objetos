package com.example.mvc.demo.example.mvc.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.mvc.demo.example.mvc.entities.Pais;
import com.example.mvc.demo.example.mvc.repositories.PaisRepository;
import org.springframework.stereotype.Service;

@Service
public class ServicioPaisImp implements ServicioPais {

    @Autowired
    PaisRepository repo;

    @Override
    public List<Pais> listPaises() {

        List<Pais> paises;

        try {
            paises = repo.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener los paises");
        }
        return paises;
    }

    @Override
    public Pais conseguirPais(String idPais) {
        Pais pais;

         try {
            pais = repo.findById(idPais).orElse(null);

         } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener el pais");
            }

        return (pais);
    }

        @Override
        public Pais grabarPais(Pais pais) {
            try {
                pais = repo.save(pais);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Error al guardar el pais");
            }
            return pais;
        }


        public Pais grabarPais(String idPais, String nombre, String idRegion) {
            Pais pais = new Pais();
            pais.setCOUNTRY_ID(idPais);
            pais.setCOUNTRY_NAME(nombre);

            return grabarPais(pais);
        }

    @Override
    public void eliminarPais(String idPais) {
      try {
            repo.deleteById(idPais);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al eliminar el pais");
        }

    }
}
