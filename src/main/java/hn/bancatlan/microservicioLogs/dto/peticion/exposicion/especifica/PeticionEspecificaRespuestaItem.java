package hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica;

import lombok.Data;
import hn.bancatlan.microservicioLogs.dto.estructura.CampoAdicional;

import java.util.List;

@Data
public class PeticionEspecificaRespuestaItem {
    private String token;
    private String id_microservicio;
    private String codigo_mensaje;
    private String mensaje_respuesta;
    private String codigo_peticion_unica;
    private String tipo_transaccion;
    private String tiempo_procesamiento;
    private String fecha_respuesta;
    private String hora_respuesta;
    private String campo_adicional;
    private String mensaje_respuesta_general;
    private String respuesta_especifica;
    private int extra1;
    private String extra2;
    private String extra3;
    private List<CampoAdicional> campoAdicionalColeccion;

}
