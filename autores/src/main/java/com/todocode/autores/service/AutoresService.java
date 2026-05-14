package com.todocode.autores.service;

import com.todocode.autores.model.Autor;
import com.todocode.autores.repository.IAutoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoresService implements IAutoresService{

    @Autowired
    private IAutoresRepository autoresRepo;
    @Override
    public List<Autor> getAutores() {return autoresRepo.findAll();}
    @Override
    public void saveAutor(Autor autor) {autoresRepo.save(autor);}
    @Override
    public void deleteAutor(Long id) {autoresRepo.findById(id).orElse(null);}
    @Override
    public Autor findAutor(Long id) {return autoresRepo.findById(id).orElse(null);}
    @Override
    public void editAutor(Long id_original, Autor autor) {this.saveAutor(autor);}
}
