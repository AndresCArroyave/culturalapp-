package com.example.tryingspringboot.repository;

import com.example.tryingspringboot.models.TipoProponente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TipoProponenteRepository extends JpaRepository<TipoProponente, UUID> {
}
