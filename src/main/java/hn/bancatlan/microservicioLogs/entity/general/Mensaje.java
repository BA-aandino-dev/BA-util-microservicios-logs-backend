package hn.bancatlan.microservicioLogs.entity.general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_mensajes", uniqueConstraints = {
        @UniqueConstraint(name = "tbl_mensajes_U_INDEX1", columnNames = {"id_mensaje", "id_aplicacion", "id_microservicio", "id_microservicio_conexion", "id_tipo_mensaje", "id_idioma", "codigo_mensaje"})
})
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mensaje", nullable = false)
    private Long idMensaje;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_aplicacion", nullable = false)
    private Aplicacion aplicacion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_microservicio", nullable = false)
    private Microservicio microservicio;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_microservicio_conexion", nullable = false)
    private MicroXConexion microservicioConexion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_mensaje", nullable = false)
    private TipoMensaje tipoMensaje;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_idioma", nullable = false)
    private Idioma idioma;

    @Size(max = 10)
    @NotNull
    @Column(name = "codigo_mensaje", nullable = false, length = 10)
    private String codigoMensaje;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_severidad", nullable = false)
    private TipoSeveridad tipoSeveridad;

    @Size(max = 10)
    @Column(name = "id_mensaje_tercero", length = 10)
    private String idMensajeTercero;

    @Size(max = 80)
    @Column(name = "mensaje_tercero", length = 80)
    private String mensajeTercero;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_mensaje", nullable = false)
    private Estado estadoMensaje;

    @Size(max = 80)
    @NotNull
    @Column(name = "descripcion", nullable = false, length = 80)
    private String descripcion;

    @Size(max = 20)
    @Column(name = "descripcion_corta", length = 20)
    private String descripcionCorta;

    @Size(max = 512)
    @Column(name = "mensaje_tecnico", length = 512)
    private String mensajeTecnico;

    @Column(name = "extra1")
    private Integer extra1;

    @Size(max = 35)
    @Column(name = "extra2", length = 35)
    private String extra2;

    @Size(max = 65)
    @Column(name = "extra3", length = 65)
    private String extra3;

}
