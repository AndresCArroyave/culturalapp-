package com.example.tryingspringboot.repository;

import com.example.tryingspringboot.models.Representante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepresentanteRepository extends JpaRepository<Representante, UUID> {
}
