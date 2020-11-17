package com.devpolo.pymeapi.services;

import java.util.List;
import java.util.Optional;

public interface CRUD <T>{
    T crear(T o);
    List<T> leer();
    Optional<T> leerPorId(Integer id);
    T actualizar();
    T eliminar();
}
