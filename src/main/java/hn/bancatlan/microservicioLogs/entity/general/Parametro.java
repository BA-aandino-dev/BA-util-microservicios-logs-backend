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
@Table(name = "tbl_parametros")
public class Parametro {
    @Id
    @Size(max = 20)
    @Column(name = "id_parametro", nullable = false, length = 20)
    private String idParametro;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_microservicio", nullable = false)
    private Microservicio microservicio;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_parametro", nullable = false)
    private TipoParametro tipoParametro;

    @Size(max = 50)
    @NotNull
    @Column(name = "nombre_parametro", nullable = false, length = 50)
    private String nombreParametro;

    @Size(max = 256)
    @NotNull
    @Column(name = "valor", nullable = false, length = 256)
    private String valor;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_parametro", nullable = false)
    private Estado estadoParametro;

    @Size(max = 100)
    @NotNull
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;

    @Column(name = "extra1")
    private Integer extra1;

    @Size(max = 35)
    @Column(name = "extra2", length = 35)
    private String extra2;

    @Size(max = 65)
    @Column(name = "extra3", length = 65)
    private String extra3;

}
