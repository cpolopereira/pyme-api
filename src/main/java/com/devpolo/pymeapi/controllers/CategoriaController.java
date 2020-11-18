package com.devpolo.pymeapi.controllers;

import com.devpolo.pymeapi.exceptions.ResourceNotFoundException;
import com.devpolo.pymeapi.models.Categoria;
import com.devpolo.pymeapi.models.Empresa;
import com.devpolo.pymeapi.models.Usuario;
import com.devpolo.pymeapi.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;

    @GetMapping(value = "/categoria")
    ResponseEntity <List<Categoria>> listar(){
        List<Categoria> users = categoriaService.leer();
        return ResponseEntity.ok(users);
    }

    @GetMapping(value="/categoria/{id}")
    ResponseEntity<Categoria> getById(@PathVariable("id") int id){
        Categoria categoria = categoriaService.leerPorId(id)
                .orElseThrow(()->new ResourceNotFoundException("Categoria with ID :"+id+" Not Found!"));
        return ResponseEntity.ok(categoria);

    }
}
