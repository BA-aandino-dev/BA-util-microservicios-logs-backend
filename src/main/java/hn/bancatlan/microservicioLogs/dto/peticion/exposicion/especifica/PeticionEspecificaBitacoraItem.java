package hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica;

import lombok.Data;
import hn.bancatlan.microservicioLogs.dto.estructura.CampoAdicional;

import java.util.List;
@Data
public class PeticionEspecificaBitacoraItem {
    private String token;
    private String id_microservicio;
    private String id_peticion_unica;
    private String clase_bitacora;
    private String metodo_bitacora;
    private String data_bitacora;
    private String tipo_registro;
    private String hora;
    private String fecha;
    private int extra1;
    private String extra2;
    private String extra3;
    private List<CampoAdicional> campoAdicionalColeccion;
}
