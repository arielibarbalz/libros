package com.todocode.libros.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutorDTO {
    private Long id;
    private String nombreCompleto;
    private Date fechaNacimiento;
    private String nacionalidad;

}
