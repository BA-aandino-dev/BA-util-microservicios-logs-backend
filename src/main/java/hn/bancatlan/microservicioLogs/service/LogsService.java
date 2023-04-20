package hn.bancatlan.microservicioLogs.service;

import hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica.PeticionEspecificaBitacora;
import hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica.PeticionEspecificaRespuesta;
import hn.bancatlan.microservicioLogs.exception.ServiceException;
import hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica.PeticionEspecificaPeticiones;
import hn.bancatlan.microservicioLogs.dto.respuesta.exposicion.especifica.RespuestaEspecifica;
import org.springframework.http.ResponseEntity;

public interface LogsService {
    ResponseEntity<RespuestaEspecifica> registraRespuesta(PeticionEspecificaRespuesta peticionEspecificaRespuesta) throws ServiceException;
    ResponseEntity<RespuestaEspecifica> registraBitacora(PeticionEspecificaBitacora peticionEspecificaBitacora) throws  ServiceException;
    ResponseEntity<RespuestaEspecifica> registraPeticiones(PeticionEspecificaPeticiones peticionEspecificaBitacora) throws  ServiceException;
}
