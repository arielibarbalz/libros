package com.todocode.libros.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibroRequestDTO {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private String descripcion;
    private List<Long> autoreesIds;
}
