package com.example.tryingspringboot.mapa;

import com.example.tryingspringboot.dto.PropuestaDTO;
import com.example.tryingspringboot.models.Propuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IPropuestaMapa {

    @Mappings({
            @Mapping(source = "id_propuesta", target = "idPropuesta"),
            @Mapping(source = "nombre_propuesta", target = "nombrePropuesta"),
            @Mapping(source = "descripcion_actividad", target = "descripcionActividad"),
            @Mapping(source = "descripcion_propuesta", target = "descripcionPropuesta"),
            @Mapping(source = "empresa_aliada", target = "empresAliada"),
            @Mapping(source = "estadosPropuesta........", target = "---------"),
            @Mapping(source = "fecha_inicio", target = "fechaInicio"),
            @Mapping(source = "fecha_presentacion", target = "fechaPresentacion"),
            @Mapping(source = "publico_beneficiario", target = "publicoBeneficiario"),
            @Mapping(source = "proponente.id", target = "proponente"),
            @Mapping(source = "valor_propuesta", target = "valorPropuesta")
    })

    PropuestaDTO propuestaToDTO(Propuesta propuesta);
}
