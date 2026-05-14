package com.todocode.libros.controller;

import com.todocode.libros.model.Libro;
import com.todocode.libros.service.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibroController {
    @Autowired
    private ILibroService libroService;

    @PostMapping("/libros/crear")
    public String crearLibro(@RequestBody Libro libro){
        System.out.println(libro.getTitulo());
        System.out.println(libro.getAnioPublicacion());
        System.out.println(libro.getDescripcion());
        libroService.saveLibro(libro);
        return "Libro cargado correctamente";
    }
    @GetMapping("/libros/traer")
    public List<Libro> getLibros(){
        return libroService.getLibros();
    }
    @DeleteMapping("libros/borrar/{id}")
    public String deleteLibro(@PathVariable Long id){
        libroService.deletelibro(id);
        return "Libro eliminado";
    }
    @PutMapping("/libros/editar/{id_original}")
    public Libro editLibro(@PathVariable Long id_original, @RequestBody Libro libroEditar){
        libroService.editLibro(id_original, libroEditar);
        Libro libroEditado = libroService.findLibro(id_original);
        return libroEditado;
    }

    public Libro findLibroISBN(@PathVariable Long isbn){
        return libroService.findLibroISBN(isbn);
    }
}
