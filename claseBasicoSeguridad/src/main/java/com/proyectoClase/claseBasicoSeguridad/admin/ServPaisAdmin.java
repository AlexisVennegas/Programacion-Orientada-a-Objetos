package com.proyectoClase.claseBasicoSeguridad.admin;

import com.proyectoClase.claseBasicoSeguridad.admin.exceptions.AdminException;
import com.proyectoClase.claseBasicoSeguridad.entities.Pais;

public interface ServPaisAdmin {



    public Pais getPais(String id) throws AdminException;

    public Pais savePais(Pais pais) throws AdminException;

    public Pais savePais(String idPais, String nombre,Integer idRegion) throws AdminException;


}
