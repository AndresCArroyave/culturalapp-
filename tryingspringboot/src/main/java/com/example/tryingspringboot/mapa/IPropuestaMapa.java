package com.example.tryingspringboot.mapa;

import com.example.tryingspringboot.dto.PropuestaDTO;
import com.example.tryingspringboot.models.Propuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IPropuestaMapa {

    @Mappings({
            @Mapping(source = "nombre_propuesta", target = ""),
    })

    PropuestaDTO propuestaToDTO(Propuesta propuesta);
}
