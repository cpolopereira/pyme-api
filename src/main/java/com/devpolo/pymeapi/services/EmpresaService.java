package com.devpolo.pymeapi.services;

import com.devpolo.pymeapi.models.Empresa;

import java.util.List;

public interface EmpresaService extends CRUD<Empresa> {
    List<Empresa> findByIdUsuario (int id);
    List<Empresa> findByIdCategoria (int id);
}
