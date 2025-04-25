package com.proyectoClase.claseBasicoSeguridad.admin;

import java.util.List;

import com.proyectoClase.claseBasicoSeguridad.admin.exceptions.AdminException;
import com.proyectoClase.claseBasicoSeguridad.entities.Direccion;
import com.proyectoClase.claseBasicoSeguridad.entities.Pais;
import com.proyectoClase.claseBasicoSeguridad.entities.Region;

public interface ServComunAdmin {
    List<Pais> listPaises() throws AdminException;

    List<Region> listaRegiones() throws AdminException;

    List<Direccion> listaDirecciones() throws AdminException;
}
