package com.generation.web.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonaDto {

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.nombre}")
    private String nombre;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.paterno}")
    private String paterno;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.materno}")
    private String materno;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.edad}")
    private String edad;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.direccion.calle}")
    private String calle;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.direccion.numEx")
    private String numExt;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.direccion.numIn}")
    private String numIn;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.direccion.colonia}")
    private String colonia;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.direccion.cp}")
    private String cp;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.direccion.ciudad}")
    private String ciudad;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.direccion.estado}")
    private String estado;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.direccion.pais}")
    private String pais;

    @NotNull
    @Size(min = 1, message = "{Size.personaDto.direccion.formatted_address}")
    private String formatted_address;

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumExt() {
        return numExt;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    public String getNumIn() {
        return numIn;
    }

    public void setNumIn(String numIn) {
        this.numIn = numIn;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }
}
