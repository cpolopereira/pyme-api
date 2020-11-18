package com.devpolo.pymeapi.services.impl;

import com.devpolo.pymeapi.models.Empresa;
import com.devpolo.pymeapi.repositories.EmpresasRepository;
import com.devpolo.pymeapi.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    EmpresasRepository empresasRepository;

    @Override
    public Empresa crear(Empresa o) {
        return null;
    }

    @Override
    public List<Empresa> leer() {
        return empresasRepository.findAll();
    }

    @Override
    public Optional<Empresa> leerPorId(Integer id) {
        return empresasRepository.findById(id);
    }

    @Override
    public Empresa actualizar() {
        return null;
    }

    @Override
    public Empresa eliminar() {
        return null;
    }

    @Override
    public List<Empresa> findByIdUsuario(int id) {
        return empresasRepository.findAllByUsuarioId(id);
    }

    @Override
    public List<Empresa> findByIdCategoria(int id) {
        return empresasRepository.findAllByCategoriaId(id);
    }
}
