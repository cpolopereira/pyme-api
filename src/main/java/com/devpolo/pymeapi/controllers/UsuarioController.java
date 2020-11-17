package com.devpolo.pymeapi.controllers;


import com.devpolo.pymeapi.exceptions.ResourceNotFoundException;
import com.devpolo.pymeapi.models.Usuario;
import com.devpolo.pymeapi.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    @GetMapping(value="/usuario")
    List<Usuario> listar(){
        return usuarioService.leer();
    }

    @GetMapping(value="/usuario/{id}")
    ResponseEntity<Usuario> getById(@PathVariable("id") int id){
        Usuario user = usuarioService.leerPorId(id)
                .orElseThrow(()->new ResourceNotFoundException("User with ID :"+id+" Not Found!"));
        return ResponseEntity.ok(user);

    }
}
