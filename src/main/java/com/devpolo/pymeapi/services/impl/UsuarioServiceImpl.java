package com.devpolo.pymeapi.services.impl;

import com.devpolo.pymeapi.models.Usuario;
import com.devpolo.pymeapi.repositories.UsuarioRepository;
import com.devpolo.pymeapi.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario crear(Usuario o) {
        return null;
    }

    @Override
    public List<Usuario> leer() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> leerPorId(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario actualizar() {
        return null;
    }

    @Override
    public Usuario eliminar() {
        return null;
    }
}
