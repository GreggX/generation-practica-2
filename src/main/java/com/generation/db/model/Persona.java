package com.generation.db.model;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private String paterno;

    private String materno;

    private String edad;

    // Relaciones

    @ManyToOne(targetEntity = Direccion.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "id_direccion", foreignKey = @ForeignKey(name = "FK_DIRECCION_PERSONA"))
    private Direccion direccion;

    public Persona() {
    }

        public Persona(String nombre, String paterno, String materno, String edad, Direccion direccion) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
