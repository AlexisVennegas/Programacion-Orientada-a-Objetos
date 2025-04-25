package com.proyectoClase.claseBasicoSeguridad.admin;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoClase.claseBasicoSeguridad.admin.exceptions.AdminException;
import com.proyectoClase.claseBasicoSeguridad.admin.exceptions.TipoExcepcionAdmin;
import com.proyectoClase.claseBasicoSeguridad.entities.Pais;
import com.proyectoClase.claseBasicoSeguridad.entities.Region;
import com.proyectoClase.claseBasicoSeguridad.repositories.PaisRepository;

@Service
public class PaisAdmin implements ServPaisAdmin{
    public static Logger log = LoggerFactory.getLogger(PaisAdmin.class);


    PaisRepository repository;


//    public PaisAdmin(PaisRepository repository){
//        this.repository=repository;
//    }

    @Override
    public Pais getPais(String id) throws AdminException {
        log.info("[getPais]");
        log.debug("[id:"+id+"]");

        try {
            Optional<Pais> paisOptional=repository.findById(id);
            if(!paisOptional.isPresent()) throw new AdminException(TipoExcepcionAdmin.ELEMENTO_NO_EXISTE);
            return paisOptional.get();
        }catch(AdminException ae){
            log.error(ae.getMessage(),ae);
            throw ae;
        }catch(Exception e){
            log.error(e.getMessage(),e);
            throw new AdminException();
        }
    }

    @Override
    public Pais savePais(Pais pais) throws AdminException{
        log.info("[savePais]");
        log.debug("[pais:{}]",pais);

        try {
            validarPais(pais);
            return repository.save(pais);
        }catch(AdminException ae){
            log.error(ae.getMessage(),ae);
            throw ae;
        }catch(Exception e){
            log.error(e.getMessage(),e);
            throw new AdminException();
        }
    }



    @Override
    public Pais savePais(String idPais, String nombre, Integer idRegion)throws AdminException {
        log.info("[savePais]");
        log.debug("[idPais:{},nombre:{},idRegion:{}]",idPais,nombre,idRegion);


        try {
            Pais pais = new Pais();
            pais.setId(idPais);
            pais.setNombre(nombre);
            Region region = new Region();
            region.setId(idRegion);
            pais.setRegion(region);
            validarPais(pais);
            return repository.save(pais);
        }catch(AdminException ae){
            log.error(ae.getMessage(),ae);
            throw ae;
        }catch(Exception e){
            log.error(e.getMessage(),e);
            throw new AdminException();
        }
    }

    @Autowired
    public void setRepository(PaisRepository repository) {
        this.repository = repository;
    }

    private void validarPais(Pais pais) throws AdminException{
        //Primero validaciones de dato
        //Segundo validaciones de negocio
    }
}
