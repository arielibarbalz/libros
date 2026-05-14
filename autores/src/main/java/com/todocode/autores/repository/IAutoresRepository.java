package com.todocode.autores.repository;

import com.todocode.autores.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutoresRepository extends JpaRepository<Autor, Long>{
}
