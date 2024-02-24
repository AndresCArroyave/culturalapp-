package com.example.tryingspringboot.mapa;

import com.example.tryingspringboot.dto.ProponenteDTO;
import com.example.tryingspringboot.models.Proponente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IProponenteMapa {

    @Mappings({
            @Mapping(source = "nombre_proponente", target = "nombreProponente"),
            @Mapping(source = "trayectoria", target = "trayectoria"),
            @Mapping(source = "representante", target = "nombreRepresentante"),
            @Mapping(source = "tipoProponente.tipo_proponente", target = "tipo_proponente")
    })

    ProponenteDTO proponenteToDTO(Proponente proponente);
}
