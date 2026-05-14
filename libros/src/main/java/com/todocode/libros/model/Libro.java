package com.todocode.libros.model;

import com.todocode.libros.dto.AutorDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private String descripcion;
    @ElementCollection
    @CollectionTable(name = "libro_autores", joinColumns = @JoinColumn(name = "libro_id"))
    private List<AutorResumen> autores;

//    public Long getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(Long isbn) {
//        this.isbn = isbn;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public int getAnioPublicacion() {
//        return anioPublicacion;
//    }
//
//    public void setAnioPublicacion(int anioPublicacion) {
//        this.anioPublicacion = anioPublicacion;
//    }
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }
}


