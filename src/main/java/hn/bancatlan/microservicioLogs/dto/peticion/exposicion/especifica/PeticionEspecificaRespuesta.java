package hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica;

import lombok.Data;
import hn.bancatlan.microservicioLogs.dto.peticion.exposicion.PeticionGeneral;

import java.util.List;

@Data
public class PeticionEspecificaRespuesta extends PeticionGeneral {

    private List<PeticionEspecificaRespuestaItem> peticionEspecificaRespuestaColeccion;

}
