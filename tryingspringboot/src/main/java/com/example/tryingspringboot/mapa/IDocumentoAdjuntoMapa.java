package com.example.tryingspringboot.mapa;

import com.example.tryingspringboot.dto.DocumentoAdjuntoDTO;
import com.example.tryingspringboot.models.DocumentoAdjunto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IDocumentoAdjuntoMapa {

    @Mappings({
            @Mapping(source = "nombre_documento", target = "nombreDocumento"),
            @Mapping(source = "URL", target = "enlace")
    })
    DocumentoAdjuntoDTO documentoAdjuntoToDTO(DocumentoAdjunto documentoAdjunto);
}
