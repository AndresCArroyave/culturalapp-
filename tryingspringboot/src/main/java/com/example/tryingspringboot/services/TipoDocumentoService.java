package com.example.tryingspringboot.services;

import com.example.tryingspringboot.dto.TipoDocumentoDTO;
import com.example.tryingspringboot.mapa.ITipoDocumentoMapa;
import com.example.tryingspringboot.models.TipoDocumento;
import com.example.tryingspringboot.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

//Aqui en esta capa validamos, operamos y activamos consulta
@Service
public class TipoDocumentoService {

    @Autowired
    TipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    ITipoDocumentoMapa iTipoDocumentoMapa;

    //Rutina para guardar en base de datos un nuevo tipo de documento
    public TipoDocumentoDTO agregarTipoDocumento(TipoDocumento datosTipoDocumento) throws Exception {
        try {
            //Validar primero
            //Si las validaciones pasan deberiamos llamar al repo para ejevutar la consulta
            return this.iTipoDocumentoMapa.tipoDocumentoToDTO(this.tipoDocumentoRepository.save(datosTipoDocumento));

        } catch (Exception error) {
            throw  new Exception((error.getMessage()));
        }
    }

    //Rutina para buscar un elemento dentro BD por ID
    public TipoDocumentoDTO buscarTipoDocumentoPorId(UUID id)throws Exception {
        try {
            if(this.tipoDocumentoRepository.findById(id).isPresent()) {
                //devuelvalo
                return this.iTipoDocumentoMapa.tipoDocumentoToDTO(this.tipoDocumentoRepository.findById(id).get());
            }else{
                //diga no esta
                throw new Exception("Usuario no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<TipoDocumentoDTO> buscarTodosTiposDocumentos() throws Exception {
        try {
            return this.iTipoDocumentoMapa.toDtoList(this.tipoDocumentoRepository.findAll());
        }catch (Exception error) {
            throw  new Exception(error.getMessage());
        }
    }

    public TipoDocumentoDTO modificarTipoDocumento(UUID id, TipoDocumento tipoDocumento)throws Exception {
        try {
            if(this.tipoDocumentoRepository.findById(id).isPresent()) {
                //cambielo
                TipoDocumento objetoEncontrado = this.tipoDocumentoRepository.findById(id).get();
                objetoEncontrado.setTipo_documento(tipoDocumento.getTipo_documento());
                return this.iTipoDocumentoMapa.tipoDocumentoToDTO(this.tipoDocumentoRepository.save(objetoEncontrado));
            }else{
                //diga no esta
                throw new Exception("Usuario no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
