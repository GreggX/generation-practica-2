package com.generation.service;

import com.generation.db.model.Direccion;
import com.generation.db.model.Persona;
import com.generation.web.dto.PersonaDto;

import java.util.List;

public interface IPersonaService {

    List<Persona> obtenerTodoPersona();

    // TODO
    Direccion asignarDireccion(PersonaDto personaDto);

    Persona registrarNuevaPersona(PersonaDto personaDto);

    Persona getPersona();

    void guardarPersonaRegistrada();

    void eliminarPersonaRegistrada();
}
