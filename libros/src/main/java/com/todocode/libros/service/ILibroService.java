package com.todocode.libros.service;

import com.todocode.libros.model.Libro;

import java.util.List;

public interface ILibroService {
    public List<Libro> getLibros();
    public void saveLibro(Libro libro);
    public void deletelibro(Long id);
    public Libro findLibro(Long id);
    public void editLibro(Long id_original, Libro libro);
    public Libro findLibroISBN(Long isbn);
}
