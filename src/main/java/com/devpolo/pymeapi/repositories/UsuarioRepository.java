package com.devpolo.pymeapi.repositories;

import com.devpolo.pymeapi.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
