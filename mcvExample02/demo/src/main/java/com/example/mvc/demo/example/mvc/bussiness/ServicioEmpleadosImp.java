package com.example.mvc.demo.example.mvc.bussiness;

import com.example.mvc.demo.example.mvc.entities.Empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mvc.demo.example.mvc.repositories.EmpleadosRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ServicioEmpleadosImp implements ServicioEmpleados{

    @Autowired
    EmpleadosRepository repoEmpleados;

    @Override
    public List<Empleados> listEmpleados() {
        return repoEmpleados.findAll();
    }

    @Override
    public Empleados conseguirEmpleado(Integer idEmpleado) {
        Empleados empleadoUnique;

        try {
            empleadoUnique = repoEmpleados.findById(idEmpleado).orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener el empleado");
        }

        return empleadoUnique;
    }

    @Override
    public Empleados grabarEmpleado(Integer idEmpleado, String nombre, String apellido, String email, String telefono, String fechaContratacion, String idTrabajo, Double salario, Double comision, Integer idJefe, Integer idDepartamento) {
        Empleados empleado = new Empleados();

        empleado.setId(idEmpleado);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setEmail(email);
        empleado.setTelefono(telefono);
        empleado.setFechaContratacion(fechaContratacion);
        empleado.setIdTrabajo(idTrabajo);
        empleado.setSalario(salario);
        empleado.setComision(comision);
        empleado.setIdJefe(idJefe);
        empleado.setIdDepartamento(idDepartamento);
        return repoEmpleados.save(empleado);
    }

    @Override
    public Empleados grabarEmpleado(Empleados empleado) {
        return null;
    }

    @Override
    public void eliminarEmpleado(Integer idEmpleado) {

    }
}
