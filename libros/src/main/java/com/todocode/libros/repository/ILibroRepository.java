package com.todocode.libros.repository;

import com.todocode.libros.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface ILibroRepository extends JpaRepository <Libro, Long> {
    @Query("SELECT l FROM Libro l WHERE l.isbn = :isbn")
    Libro findByISBN(Long isbn);
}
