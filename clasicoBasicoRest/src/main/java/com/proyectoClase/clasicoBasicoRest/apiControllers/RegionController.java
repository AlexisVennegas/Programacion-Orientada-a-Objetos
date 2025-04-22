package com.proyectoClase.clasicoBasicoRest.apiControllers;

import com.proyectoClase.clasicoBasicoRest.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyectoClase.clasicoBasicoRest.entities.Region;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/regions")
public class RegionController {

    // Inyección de dependencias
    @Autowired
    RegionRepository regionRepository;

   @GetMapping
   public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Region getRegionById(@PathVariable Integer id) {

        Optional <Region> regionOptional = regionRepository.findById(id);


        Region region = regionRepository.findById(id).orElseThrow(() -> new RuntimeException("Region not found"));

        return region;
    }

    @PostMapping
    public Region createRegion(@RequestBody Region region) {
        return regionRepository.save(region);
    }

    @PutMapping
    public Region updateRegion(Region region) {

        return regionRepository.save(region);
    }
    @DeleteMapping("/{id}")
    public void deleteRegion(@PathVariable Integer id) {
        regionRepository.deleteById(id);
    }
}
