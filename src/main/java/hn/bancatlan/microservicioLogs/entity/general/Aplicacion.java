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
@Table(name = "tbl_aplicaciones", uniqueConstraints = {
        @UniqueConstraint(name = "tbl_aplicaciones_U_INDEX1", columnNames = {"id_aplicacion", "id_tipo_aplicacion"})
})
public class Aplicacion {
    @Id
    @Size(max = 10)
    @Column(name = "id_aplicacion", nullable = false, length = 10)
    private String idAplicacion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_aplicacion", nullable = false)
    private TipoAplicacion tipoAplicacion;

    @Size(max = 50)
    @NotNull
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_aplicacion", nullable = false)
    private Estado estadoAplicacion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_autenticacion", nullable = false)
    private Estado estadoAutenticacion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_registro_logs", nullable = false)
    private Estado estadoRegistroLogs;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_registro_bitacora", nullable = false)
    private Estado estadoRegistroBitacora;

    @Column(name = "extra1")
    private Integer extra1;

    @Size(max = 35)
    @Column(name = "extra2", length = 35)
    private String extra2;

    @Size(max = 65)
    @Column(name = "extra3", length = 65)
    private String extra3;

}
