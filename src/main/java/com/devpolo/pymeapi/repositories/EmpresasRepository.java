package com.devpolo.pymeapi.repositories;

import com.devpolo.pymeapi.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpresasRepository extends JpaRepository<Empresa, Integer> {
    List<Empresa> findAllByUsuarioId(int id);

    List<Empresa> findAllByCategoriaId(int id);
}
