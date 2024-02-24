package com.example.tryingspringboot.mapa;


import com.example.tryingspringboot.dto.TIpoProponenteDTO;
import com.example.tryingspringboot.models.TipoProponente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ITipoProponenteMapa {

    @Mappings({
        @Mapping(source = "id_tipo_proponente", target = "idProponente"),//Modelo y DTO
        @Mapping(source = "tipo_proponente", target="tipoProponente")   //Modelo y DTO
    })
    TIpoProponenteDTO tipoProponenteToDTO(TipoProponente tipoProponente);
}
