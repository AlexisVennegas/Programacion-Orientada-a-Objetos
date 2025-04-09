package com.example.mvc.demo.example.mvc.common.exceptions;
import java.io.Serializable;

@SuppressWarnings("serial")
public class ServicioException extends Exception {

    final String codigo;

    public ServicioException(String codigo, Exception e) {
        super(e.getMessage());
        this.codigo=codigo;
    }

    public ServicioException(String codigo) {
        this.codigo=codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

}