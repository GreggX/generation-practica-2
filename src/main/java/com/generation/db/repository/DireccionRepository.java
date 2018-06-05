package com.generation.db.repository;

import com.generation.db.model.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {

    Optional<Direccion> findById(Long id);

    Direccion findByFormatted(String formatted);

    @Override
    void delete(Direccion direccion);
}
