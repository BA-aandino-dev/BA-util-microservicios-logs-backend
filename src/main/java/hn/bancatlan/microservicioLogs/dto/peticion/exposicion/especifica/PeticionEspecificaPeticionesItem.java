package hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica;



import lombok.Data;
import hn.bancatlan.microservicioLogs.dto.estructura.CampoAdicional;

import java.util.List;
@Data
public class PeticionEspecificaPeticionesItem {
    private String id_peticion;
    private String token;
    private String id_servicio;
    private String id_aplicacion;
    private String id_pais;
    private String id_institucion;
    private String id_region;
    private String id_motor;
    private String idioma;
    private String version;
    private String llave_sesion;
    private String id_usuario;
    private String id_cliente_core;
    private String id_dispositivo;
    private String paso;
    private String ambiente;
    private String mandante;
    private String codigo_peticion_unica;
    private String id_core;
    private String id_agencia;
    private String id_sucursal;
    private String usuario_aplicacion;
    private String direccion_ip;
    private String tipo_procesamiento;
    private String identificador_id_proceso;
    private String identificador_referencia_bus;
    private String iden_numero_transaccion;
    private String identificador_tipo_transaccion;
    private String parametro_adicional;
    private String peticion_especifica;
    private String fecha_peticion;
    private String hora_peticion;
    private int extra1;
    private String extra2;
    private String extra3;
    private List<CampoAdicional> campoAdicionalColeccion;
}
