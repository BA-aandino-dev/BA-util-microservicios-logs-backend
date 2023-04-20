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
@Table(name = "tbl_microservicios")
public class Microservicio {
    @Id
    @Size(max = 10)
    @Column(name = "id_microservicio", nullable = false, length = 10)
    private String idMicroservicio;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_servicio", nullable = false)
    private Servicio servicio;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_movimiento", nullable = false)
    private TipoMovimiento tipoMovimiento;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_transaccion", nullable = false)
    private TipoTransaccion tipoTransaccion;

    @Size(max = 60)
    @Column(name = "descripcion", length = 60)
    private String descripcion;

    @Size(max = 10)
    @Column(name = "nomenclatura", length = 10)
    private String nomenclatura;

    @Size(max = 6)
    @NotNull
    @Column(name = "tipo", nullable = false, length = 6)
    private String tipo;

    @Size(max = 6)
    @Column(name = "puerto_conexion", length = 6)
    private String puertoConexion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_microservicio", nullable = false)
    private Estado estadoMicroservicio;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_registro_log", nullable = false)
    private Estado estadoRegistroLog;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_registro_bitacora", nullable = false)
    private Estado estadoRegistroBitacora;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_autenticacion", nullable = false)
    private Estado estadoAutenticacion;

    @Column(name = "extra1")
    private Integer extra1;

    @Size(max = 35)
    @Column(name = "extra2", length = 35)
    private String extra2;

    @Size(max = 65)
    @Column(name = "extra3", length = 65)
    private String extra3;

}
