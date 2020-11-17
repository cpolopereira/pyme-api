package com.devpolo.pymeapi.services.impl;

import com.devpolo.pymeapi.models.Categoria;
import com.devpolo.pymeapi.repositories.CategoriaRepository;
import com.devpolo.pymeapi.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Categoria crear(Categoria o) {
        return null;
    }

    @Override
    public List<Categoria> leer() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> leerPorId(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria actualizar() {
        return null;
    }

    @Override
    public Categoria eliminar() {
        return null;
    }
}
