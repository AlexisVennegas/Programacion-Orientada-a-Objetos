package com.proyectoClase.claseBasicoSeguridad.data;

import org.springframework.stereotype.Component;

import lombok.*;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Casa {
    private int id;
    private String nombre;


}
