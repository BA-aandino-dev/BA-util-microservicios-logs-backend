/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.bancatlan.microservicioLogs.dto.respuesta.exposicion.especifica;

import hn.bancatlan.microservicioLogs.dto.estructura.MensajeRespuesta;
import hn.bancatlan.microservicioLogs.dto.estructura.CampoAdicional;
import lombok.Data;

import java.util.List;

/**
 *
 * @author jcruzm
 */
@Data
public class RespuestaEspecificaItem {
    private int numeroItem;
    private String campoEspecifico1;
    private String campoEspecifico2;
    private String campoEspecifico3;
    private List<CampoAdicional> campoAdicionalColeccion;
    private List<MensajeRespuesta> mensajeRespuestaColeccion;
}
