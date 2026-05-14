package com.todocode.autores.controller;

import com.todocode.autores.model.Autor;
import com.todocode.autores.service.IAutoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AutoresController {
    @Autowired
    private IAutoresService autoresService;
    @PostMapping("/autores/crear")
    public String crearAutor(@RequestBody Autor autor){
        autoresService.saveAutor(autor);
        return "Autor creado correctamente";
    }
    @GetMapping("/autores/traer")
    public List<Autor> traerAutores(){
        return autoresService.getAutores();
    }
    @DeleteMapping
    public String deleteAutores(@PathVariable Long id){
        autoresService.deleteAutor(id);
        return "Paciente eliminado";
    }
    @PostMapping("/")
    public Autor editAutor(@PathVariable Long id_original, @RequestBody Autor autorEditar){
        autoresService.editAutor(id_original, autorEditar);
        Autor autorEditado = autoresService.findAutor(id_original);
        return autorEditado;
    }
}
