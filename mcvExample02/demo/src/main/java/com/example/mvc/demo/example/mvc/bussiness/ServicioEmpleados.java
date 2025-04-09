package com.example.mvc.demo.example.mvc.bussiness;

import com.example.mvc.demo.example.mvc.entities.Empleados;
import java.util.List;
public interface ServicioEmpleados {

    List<Empleados> listEmpleados();

    Empleados conseguirEmpleado(Integer idEmpleado);


    Empleados grabarEmpleado(Empleados empleado);

    void eliminarEmpleado(Integer idEmpleado);

    Empleados grabarEmpleado(Integer id, String nombre, String apellido, String email, String telefono, String fechaContratacion, String idTrabajo, Double salario, Double comision, Integer idJefe, Integer idDepartamento);
}
