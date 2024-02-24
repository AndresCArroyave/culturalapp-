package com.example.tryingspringboot.repository;

import com.example.tryingspringboot.models.Proponente;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProponenteRepository extends JpaRepository<Proponente, UUID> {
}
