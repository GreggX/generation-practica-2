package com.generation.db.repository;

import com.generation.db.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    Optional<Persona> findById(Long id);

    Persona findByNombre(String nombre);

    @Override
    void delete(Persona persona);
}
