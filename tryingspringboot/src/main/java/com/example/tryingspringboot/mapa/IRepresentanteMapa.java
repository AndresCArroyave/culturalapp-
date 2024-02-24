package com.example.tryingspringboot.mapa;

import com.example.tryingspringboot.dto.RepresentanteDTO;
import com.example.tryingspringboot.models.Representante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IRepresentanteMapa {

    @Mappings({
            @Mapping(source = "tipoDocumento.tipo_documento", target = "tipoDocumento"), //Modelo y DTO
            @Mapping(source = "correo_electronico", target = "correoElectronico"), //Modelo y DTO
            @Mapping(source = "numero_documento", target = "numeroDocumento"),
            @Mapping(source = "primer_nombre", target = "nombre"),
            @Mapping(source = "primer_apellido", target = "apellido"),
            @Mapping(source = "telefono_celular", target = "telefonoCelular"),
            @Mapping(source = "telefono_fijo", target = "telefonoFijo"),
    })
    RepresentanteDTO representanteToDTO(Representante representante);
}
