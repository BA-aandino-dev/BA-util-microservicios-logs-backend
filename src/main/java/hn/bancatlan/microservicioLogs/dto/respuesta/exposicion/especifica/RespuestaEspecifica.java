/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.bancatlan.microservicioLogs.dto.respuesta.exposicion.especifica;

import hn.bancatlan.microservicioLogs.dto.respuesta.exposicion.RespuestaGeneral;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 *
 * @author jcruzm
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RespuestaEspecifica extends RespuestaGeneral {
    private List<RespuestaEspecificaItem> respuestaEspecificaColeccion;
}
