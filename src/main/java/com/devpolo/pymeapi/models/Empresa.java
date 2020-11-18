package com.devpolo.pymeapi.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "empresas")
@Data
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String telefono;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String web;
    @ManyToOne()
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
    @ManyToOne()
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
