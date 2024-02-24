package com.example.tryingspringboot.repository;

import com.example.tryingspringboot.models.ValorPropuesta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ValorPropuestaRepository extends JpaRepository<ValorPropuesta, UUID> {
}

