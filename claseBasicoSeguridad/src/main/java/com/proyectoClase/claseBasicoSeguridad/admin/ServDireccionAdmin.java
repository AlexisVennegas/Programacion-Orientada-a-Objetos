package com.proyectoClase.claseBasicoSeguridad.admin;

import java.util.List;

import com.proyectoClase.claseBasicoSeguridad.admin.exceptions.AdminException;
import com.proyectoClase.claseBasicoSeguridad.entities.Direccion;

public interface ServDireccionAdmin {

    List<Direccion> listaDirecciones(String idPais) throws AdminException;
}
