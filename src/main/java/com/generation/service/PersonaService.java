package com.generation.service;

import com.generation.db.model.Direccion;
import com.generation.db.model.Persona;
import com.generation.db.repository.DireccionRepository;
import com.generation.db.repository.PersonaRepository;
import com.generation.web.dto.PersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonaService implements IPersonaService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> obtenerTodoPersona() {
        return personaRepository.findAll();
    }


    // TODO
    @Override
    public Direccion asignarDireccion(final PersonaDto direccion) {
        final Direccion direccionPersona = new Direccion();
        direccionPersona.setCalle(direccion.getCalle());
        direccionPersona.setColonia(direccion.getColonia());
        direccionPersona.setNumEx(direccion.getNumExt());
        direccionPersona.setNumInt(direccion.getNumIn());
        direccionPersona.setCp(direccion.getCp());
        direccionPersona.setEstado(direccion.getEstado());
        direccionPersona.setPais(direccion.getPais());
        direccionPersona.setFormatted(direccion.getFormatted_address());

        return direccionRepository.save(direccionPersona);
    }

    @Override
    public Persona registrarNuevaPersona(final PersonaDto personaDto) {
        final Persona persona = new Persona();
        persona.setNombre(personaDto.getNombre());
        persona.setPaterno(personaDto.getPaterno());
        persona.setMaterno(personaDto.getMaterno());
        persona.setEdad(personaDto.getEdad());

        return personaRepository.save(persona);
    }

    @Override
    public Persona getPersona() {
        return null;
    }

    @Override
    public void guardarPersonaRegistrada() {

    }

    @Override
    public void eliminarPersonaRegistrada() {

    }
}
