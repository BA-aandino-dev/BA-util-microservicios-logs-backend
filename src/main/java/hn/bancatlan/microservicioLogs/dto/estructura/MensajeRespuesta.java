/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.bancatlan.microservicioLogs.dto.estructura;

import lombok.Data;

/**
 *
 * @author jcruzm
 */
@Data
public class MensajeRespuesta {
    private int numeroLinea;
    private String tipoMensajeRespuesta;
    private String tipoSeveridad;
    private String codigoMensajeRespuesta;
    private String descripcionMensajeRespuesta;
    private String detalleTecnicoRespuesta;
}
