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
@Table(name = "tbl_respuesta")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta", nullable = false)
    private Long idRespuesta;

    @Size(max = 255)
    @Column(name = "token")
    private String token;

    @Size(max = 10)
    @Column(name = "id_microservicio", length = 10)
    private String idMicroservicio;

    @Size(max = 10)
    @Column(name = "codigo_mensaje", length = 10)
    private String codigoMensaje;

    @Size(max = 30)
    @Column(name = "mensaje_respuesta", length = 30)
    private String mensajeRespuesta;

    @Size(max = 70)
    @Column(name = "codigo_peticion_unica", length = 70)
    private String codigoPeticionUnica;

    @Size(max = 25)
    @Column(name = "tipo_transaccion", length = 25)
    private String tipoTransaccion;

    @Size(max = 35)
    @Column(name = "tiempo_procesamiento", length = 35)
    private String tiempoProcesamiento;

    @Column(name = "fecha_respuesta")
    private LocalDate fechaRespuesta;

    @Size(max = 15)
    @Column(name = "hora_respuesta", length = 15)
    private String horaRespuesta;

    @Size(max = 4000)
    @Column(name = "campo_adicional", length = 4000)
    private String campoAdicional;

    @Size(max = 4000)
    @Column(name = "mensaje_respuesta_general", length = 4000)
    private String mensajeRespuestaGeneral;

    @Lob
    @Column(name = "respuesta_especifica")
    private String respuestaEspecifica;

    @Column(name = "extra1")
    private Integer extra1;

    @Size(max = 35)
    @Column(name = "extra2", length = 35)
    private String extra2;

    @Size(max = 65)
    @Column(name = "extra3", length = 65)
    private String extra3;

}
