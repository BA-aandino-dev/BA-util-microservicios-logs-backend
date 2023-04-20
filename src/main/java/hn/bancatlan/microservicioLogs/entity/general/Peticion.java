package hn.bancatlan.microservicioLogs.entity.general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_peticiones")
public class Peticion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_peticion", nullable = false)
    private Long idPeticion;

    @Size(max = 255)
    @Column(name = "token")
    private String token;

    @Size(max = 10)
    @Column(name = "id_servicio", length = 10)
    private String idServicio;

    @Size(max = 10)
    @Column(name = "id_aplicacion", length = 10)
    private String idAplicacion;

    @Size(max = 4)
    @Column(name = "id_pais", length = 4)
    private String idPais;

    @Size(max = 10)
    @Column(name = "id_institucion", length = 10)
    private String idInstitucion;

    @Size(max = 10)
    @Column(name = "id_region", length = 10)
    private String idRegion;

    @Size(max = 5)
    @Column(name = "id_motor", length = 5)
    private String idMotor;

    @Size(max = 5)
    @Column(name = "idioma", length = 5)
    private String idioma;

    @Size(max = 10)
    @Column(name = "version", length = 10)
    private String version;

    @Size(max = 256)
    @Column(name = "llave_sesion", length = 256)
    private String llaveSesion;

    @Size(max = 50)
    @Column(name = "id_usuario", length = 50)
    private String idUsuario;

    @Size(max = 15)
    @Column(name = "id_cliente_core", length = 15)
    private String idClienteCore;

    @Size(max = 128)
    @Column(name = "id_dispositivo", length = 128)
    private String idDispositivo;

    @Size(max = 2)
    @Column(name = "paso", length = 2)
    private String paso;

    @Size(max = 3)
    @Column(name = "ambiente", length = 3)
    private String ambiente;

    @Size(max = 4)
    @Column(name = "mandante", length = 4)
    private String mandante;

    @Size(max = 70)
    @Column(name = "codigo_peticion_unica", length = 70)
    private String codigoPeticionUnica;

    @Size(max = 10)
    @Column(name = "id_core", length = 10)
    private String idCore;

    @Size(max = 10)
    @Column(name = "id_agencia", length = 10)
    private String idAgencia;

    @Size(max = 10)
    @Column(name = "id_sucursal", length = 10)
    private String idSucursal;

    @Size(max = 50)
    @Column(name = "usuario_aplicacion", length = 50)
    private String usuarioAplicacion;

    @Size(max = 50)
    @Column(name = "direccion_ip", length = 50)
    private String direccionIp;

    @Size(max = 4)
    @Column(name = "tipo_procesamiento", length = 4)
    private String tipoProcesamiento;

    @Size(max = 70)
    @Column(name = "identificador_id_proceso", length = 70)
    private String identificadorIdProceso;

    @Size(max = 70)
    @Column(name = "identificador_referencia_bus", length = 70)
    private String identificadorReferenciaBus;

    @Size(max = 70)
    @Column(name = "iden_numero_transaccion", length = 70)
    private String idenNumeroTransaccion;

    @Size(max = 25)
    @Column(name = "identificador_tipo_transaccion", length = 25)
    private String identificadorTipoTransaccion;

    @Size(max = 4000)
    @Column(name = "parametro_adicional", length = 4000)
    private String parametroAdicional;

    @Lob
    @Column(name = "peticion_especifica")
    private String peticionEspecifica;

    @Column(name = "fecha_peticion")
    private LocalDate fechaPeticion;

    @Size(max = 15)
    @Column(name = "hora_peticion", length = 15)
    private String horaPeticion;

    @Column(name = "extra1")
    private Integer extra1;

    @Size(max = 35)
    @Column(name = "extra2", length = 35)
    private String extra2;

    @Size(max = 65)
    @Column(name = "extra3", length = 65)
    private String extra3;

}
