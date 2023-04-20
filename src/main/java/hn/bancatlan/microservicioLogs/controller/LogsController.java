package hn.bancatlan.microservicioLogs.controller;

import hn.bancatlan.microservicioLogs.exception.ServiceException;
import hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica.PeticionEspecificaBitacora;
import hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica.PeticionEspecificaRespuesta;
import hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica.PeticionEspecificaPeticiones;
import hn.bancatlan.microservicioLogs.dto.respuesta.exposicion.especifica.RespuestaEspecifica;
import hn.bancatlan.microservicioLogs.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/logs")
public class LogsController {

    @Autowired
    LogsService logsService;


    @PostMapping(value = "/registraRespuesta", consumes = "application/json", produces = "application/json")
    public ResponseEntity<RespuestaEspecifica> registraRespuesta(@RequestBody PeticionEspecificaRespuesta peticionEspecificaRespuesta) throws ServiceException {
        try {
            return logsService.registraRespuesta(peticionEspecificaRespuesta);
        }catch (Exception e){

        }finally {

        }
        return logsService.registraRespuesta(peticionEspecificaRespuesta);
    }


    @PostMapping(value = "/registraBitacora", consumes = "application/json", produces = "application/json")
    public ResponseEntity<RespuestaEspecifica> registraBitacora(@RequestBody PeticionEspecificaBitacora peticionEspecificaBitacora) throws ServiceException{
        try {
            return logsService.registraBitacora(peticionEspecificaBitacora);
        }catch (Exception e){

        }finally {

        }
        return logsService.registraBitacora(peticionEspecificaBitacora);
    }

    @PostMapping(value = "/registraPeticiones", consumes = "application/json", produces = "application/json")
    public ResponseEntity<RespuestaEspecifica> registraPeticiones(@RequestBody PeticionEspecificaPeticiones peticionEspecificaPeticiones) throws  ServiceException{
        try {
            return logsService.registraPeticiones(peticionEspecificaPeticiones);
        }catch (Exception e){

        }finally {

        }
        return logsService.registraPeticiones(peticionEspecificaPeticiones);
    }

}


