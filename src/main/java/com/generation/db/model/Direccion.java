package com.generation.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
public class Direccion {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String calle;

    private String numEx;

    private String numInt;

    private String cp;

    private String colonia;

    private String estado;

    private String pais;

    private String formatted;

    public Direccion() {
    }

    public Direccion(String calle, String numEx, String numInt, String cp, String colonia, String formatted) {
        this.calle = calle;
        this.numEx = numEx;
        this.numInt = numInt;
        this.cp = cp;
        this.colonia = colonia;
        this.formatted = formatted;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Direccion(String calle, String numEx, String numInt, String cp, String colonia, String estado, String pais, String formatted) {

        this.calle = calle;
        this.numEx = numEx;
        this.numInt = numInt;
        this.cp = cp;
        this.colonia = colonia;
        this.estado = estado;
        this.pais = pais;
        this.formatted = formatted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumEx() {
        return numEx;
    }

    public void setNumEx(String numEx) {
        this.numEx = numEx;
    }

    public String getNumInt() {
        return numInt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formated) {
        this.formatted = formated;
    }

}
