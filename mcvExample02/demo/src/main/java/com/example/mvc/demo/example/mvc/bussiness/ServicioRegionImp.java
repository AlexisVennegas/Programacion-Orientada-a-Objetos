package com.example.mvc.demo.example.mvc.bussiness;


import com.example.mvc.demo.example.mvc.entities.Region;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.mvc.demo.example.mvc.repositories.RegionRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ServicioRegionImp implements ServicioRegion {

    // aqui tendremos el repositorio
    @Autowired
    RegionRepository repo;


    @Override
    public List<Region> listRegiones() {
        List<Region> regiones;

       try {
            regiones = repo.findAll();
       } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener las regiones");
        }
        return regiones;
    }

    @Override
    public Region conseguirRegion(Integer idRegion) {


        // Aqui tenemos que buscar la region por id
        Region region;

        try{
            // usamos findbid de una
            region = repo.findById(idRegion).orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener la region");
        }
        return region;
    }

    @Override
    public Region grabarRegion(Region region) {
        return null;
    }

    @Override
    public void eliminarRegion(Integer idRegion) {

    }
}
