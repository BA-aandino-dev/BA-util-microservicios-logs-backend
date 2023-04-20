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
@Table(name = "tbl_tecnologias_x_servicio")
public class TecnologiasXServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tecnologia", nullable = false)
    private Long idTecnologia;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_servicio", nullable = false)
    private Servicio servicio;

    @Size(max = 40)
    @NotNull
    @Column(name = "descripcion", nullable = false, length = 40)
    private String descripcion;

    @Size(max = 35)
    @NotNull
    @Column(name = "version", nullable = false, length = 35)
    private String version;

    @Size(max = 35)
    @Column(name = "librerias", length = 35)
    private String librerias;

    @Size(max = 35)
    @Column(name = "framework", length = 35)
    private String framework;

    @Size(max = 120)
    @Column(name = "observaciones", length = 120)
    private String observaciones;

    @Column(name = "extra1")
    private Integer extra1;

    @Size(max = 35)
    @Column(name = "extra2", length = 35)
    private String extra2;

    @Size(max = 65)
    @Column(name = "extra3", length = 65)
    private String extra3;

}
