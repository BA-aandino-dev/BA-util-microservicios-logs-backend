package hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica;

import hn.bancatlan.microservicioLogs.dto.peticion.exposicion.PeticionGeneral;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.List;

/**
 *
 * @author cdaguilar
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PeticionEspecificaBitacora extends PeticionGeneral {

    private List<PeticionEspecificaBitacoraItem> peticionEspecificaBitacoraColeccion;
}
