package com.todocode.libros.model;

import jakarta.persistence.ElementCollection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autor {
    private Long id;
    private String nombreCompleto;
    private Date fechaNacimiento;
    private List<String> idLibrosEscritos;
}
