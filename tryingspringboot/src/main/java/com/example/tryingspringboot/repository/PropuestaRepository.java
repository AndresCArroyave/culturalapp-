package com.example.tryingspringboot.repository;

import com.example.tryingspringboot.models.Propuesta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PropuestaRepository extends JpaRepository<Propuesta, UUID> {
}
