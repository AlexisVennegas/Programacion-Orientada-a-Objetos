package com.example.mvc.demo.example.mvc.bussiness;

import java.util.List;

import com.example.mvc.demo.example.mvc.entities.Region;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.mvc.demo.example.mvc.entities.Pais;
import com.example.mvc.demo.example.mvc.repositories.PaisRepository;
import org.springframework.stereotype.Service;

@Service
public class ServicioPaisImp implements ServicioPais {

    @Autowired
    PaisRepository repo;

    @Autowired
    ServicioRegion regionRepo;

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
    public Pais grabarPais(String idPais, String nombre, Integer idRegion) {
        try {
            // Verificar si el país ya existe
            if (repo.existsById(idPais)) {
                throw new RuntimeException("El ID del país ya existe: " + idPais);
            }



            // Crear el objeto Pais con la región obtenida
            Pais pais = new Pais();
            pais.setCOUNTRY_ID(idPais);
            pais.setCOUNTRY_NAME(nombre);
            Region region = new Region();
            region.setREGION_ID(idRegion);
            pais.setRegion(region);

            // Guardar en la base de datos
            return repo.save(pais);

        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al guardar el país: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al guardar el país: " + e.getMessage());
        }
    }

    @Override
    public Pais grabarPais(Pais pais) {
        return repo.save(pais);
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
