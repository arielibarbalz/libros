package com.todocode.libros.service;

import com.todocode.libros.model.Libro;
import com.todocode.libros.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService implements ILibroService{
    @Autowired
    private ILibroRepository libroRepo;
    @Override
    public List<Libro> getLibros() {
        return libroRepo.findAll();
    }

    @Override
    public void saveLibro(Libro libro) {libroRepo.save(libro);

    }

    @Override
    public void deletelibro(Long id) {
        libroRepo.findById(id).orElse(null);
    }

    @Override
    public Libro findLibro(Long id) {
        return libroRepo.findById(id).orElse(null);
    }

    @Override
    public void editLibro(Long id_original, Libro libro) {
        this.saveLibro(libro);
    }

    @Override
    public Libro findLibroISBN(Long isbn) {
        return libroRepo.findByISBN(isbn);
    }
}
