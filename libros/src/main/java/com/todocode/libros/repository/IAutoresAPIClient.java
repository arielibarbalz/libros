package com.todocode.libros.repository;

import com.todocode.libros.dto.AutorDTO;
import com.todocode.libros.model.Autor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "autoresApi", url = "http://localhost:9004/autores")
public interface IAutoresAPIClient {
    @GetMapping("/traer/{id}")
    AutorDTO getAutorById(@PathVariable("id") Long id);
    @GetMapping
    AutorDTO getAutorByNombre(@PathVariable("nombre") String nombre);
}
