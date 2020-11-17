package com.devpolo.pymeapi.repositories;

import com.devpolo.pymeapi.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresasRepository extends JpaRepository<Empresa, Integer> {
}
