package com.example.tryingspringboot.repository;

import com.example.tryingspringboot.models.DocumentoAdjunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DocumentoAdjuntoRepository extends JpaRepository<DocumentoAdjunto, UUID> {


}
