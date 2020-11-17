package com.devpolo.pymeapi.controllers;

import com.devpolo.pymeapi.exceptions.ResourceNotFoundException;
import com.devpolo.pymeapi.models.Empresa;
import com.devpolo.pymeapi.models.Usuario;
import com.devpolo.pymeapi.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @GetMapping(value = "/empresa")
    List<Empresa> listar(){
       return empresaService.leer();
    }

    @GetMapping(value="/empresa/{id}")
    ResponseEntity<Empresa> getById(@PathVariable("id") int id){
        Empresa empresa = empresaService.leerPorId(id)
                .orElseThrow(()->new ResourceNotFoundException("Empresa with ID :"+id+" Not Found!"));
        return ResponseEntity.ok(empresa);

    }

}
