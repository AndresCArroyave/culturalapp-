package com.example.tryingspringboot.mapa;

import com.example.tryingspringboot.dto.TipoDocumentoDTO;
import com.example.tryingspringboot.dto.ValorPropuestaDTO;
import com.example.tryingspringboot.models.TipoDocumento;
import com.example.tryingspringboot.models.ValorPropuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IValorPropuesta {

    @Mappings({
            @Mapping(source = " id_valor_propuesta", target = "idValorPropuesta"),//Modelo y DTO
            @Mapping(source = "propuesta", target="propuesta"),   //Modelo y DTO
            @Mapping(source = "aporte_comfama", target="aporteComfama"),   //Modelo y DTO
            @Mapping(source = "monto_total_propuesta", target="montoTotalPropuesta")   //Modelo y DTO
    })

    ValorPropuestaDTO valorPropuestaToDTO(ValorPropuesta valorPropuesta);
}
