package com.example.tryingspringboot.mapa;

import com.example.tryingspringboot.dto.ProponenteDTO;
import com.example.tryingspringboot.dto.TipoDocumentoDTO;
import com.example.tryingspringboot.models.Proponente;
import com.example.tryingspringboot.models.TipoDocumento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ITipoDocumentoMapa {

    @Mappings({
            @Mapping(source = " id_tipo_documento", target = "IdDocumento"),//Modelo y DTO
            @Mapping(source = "tipo_documento", target="tipoDocumento")   //Modelo y DTO
    })

    TipoDocumentoDTO tipoDocumentoToDTO(TipoDocumento tipoDocumento);

    List<TipoDocumentoDTO> toDtoList(List<TipoDocumento> tipoDocumentoList);
}
