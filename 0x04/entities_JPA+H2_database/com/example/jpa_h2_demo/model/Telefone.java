package com.example.jpa_h2_demo.model;

import jakarta.persistence.*;

@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private String tipo;

    // Muitos telefones pertencem a um cliente
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Telefone() {}

    public Telefone(String numero, String tipo, Cliente cliente) {
        this.numero = numero;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    // getters e setters
}
