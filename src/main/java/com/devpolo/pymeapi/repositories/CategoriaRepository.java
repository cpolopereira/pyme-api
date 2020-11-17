package com.devpolo.pymeapi.repositories;

import com.devpolo.pymeapi.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
