package hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica;

import hn.bancatlan.microservicioLogs.dto.peticion.exposicion.PeticionGeneral;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.List;

/**
 *
 * @author cdaguilar-acastellanos
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PeticionEspecificaPeticiones extends PeticionGeneral {

    private List<PeticionEspecificaPeticionesItem> peticionEspecificaPeticionesColeccion;

}
