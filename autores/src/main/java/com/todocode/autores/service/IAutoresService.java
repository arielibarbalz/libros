package com.todocode.autores.service;

import com.todocode.autores.model.Autor;

import java.util.List;

public interface IAutoresService {
    public List<Autor> getAutores();
    public void saveAutor(Autor autor);
    public void deleteAutor(Long id);
    public Autor findAutor(Long id);
    public void editAutor(Long id_original, Autor autor);
}
