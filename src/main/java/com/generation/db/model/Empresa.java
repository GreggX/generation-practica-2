package com.generation.db.model;

import javax.persistence.*;

@Entity(name = "empresa")
public class Empresa {
    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String razonSocial;

    public Empresa() {
    }

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
