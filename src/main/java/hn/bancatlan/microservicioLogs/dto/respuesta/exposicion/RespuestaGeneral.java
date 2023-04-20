/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.bancatlan.microservicioLogs.dto.respuesta.exposicion;

import lombok.Data;
import hn.bancatlan.microservicioLogs.dto.estructura.CampoAdicional;
import hn.bancatlan.microservicioLogs.dto.estructura.MensajeRespuesta;

import java.util.List;

/**
 *
 * @author jcruzm
 */
@Data
public class RespuestaGeneral {
    private String codigoRespuesta;
    private String mensajeRespuesta;
    private String codigoTransaccion;
    private String codigoPeticionUnica;
    private String tipoTransaccion;
    private String tipoProcesamiento;
    private String fechaRespuesta;
    private String horaRespuesta;
    
    private List<CampoAdicional> campoAdicionalColeccion;
    private List<MensajeRespuesta> mensajeRespuestaColeccion;
    
    
}
