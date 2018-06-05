package com.generation.spring;

import com.generation.db.model.Direccion;
import com.generation.db.model.Persona;
import com.generation.db.repository.DireccionRepository;
import com.generation.db.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class SetupDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private boolean alreadySetup = false;

    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (alreadySetup) {
            return;
        }

        final Direccion direccionUno = crearDireccionSiNoExiste("calle", "cp", "numExt", "numInt", "Col", "formattef");

        crearPersonaSiNoExiste("dklsajds", "Gonzalez", "Vazquez", "23", direccionUno);

        alreadySetup = true;
    }

    @Transactional
    Direccion crearDireccionSiNoExiste(final String calle, final String cp,final String numEx, final String numInt, final String col, final String formatted) {
        Direccion direccion = direccionRepository.findByFormatted(formatted);
        if (direccion == null){
            direccion = new Direccion(calle, cp, numInt, numEx, col,formatted);
            direccion = direccionRepository.save(direccion);
        }

        return direccion;
    }

    @Transactional
    Persona crearPersonaSiNoExiste(final String nombre, final String paterno, final String materno, final String edad, final Direccion direccion) {
        Persona persona = personaRepository.findByNombre(nombre);
        if (persona == null) {
            persona = new Persona();
            persona.setNombre(nombre);
            persona.setPaterno(paterno);
            persona.setMaterno(materno);
            persona.setEdad(edad);
        }
        persona.setDireccion(direccion);
        personaRepository.save(persona);

        return persona;
    }
}
