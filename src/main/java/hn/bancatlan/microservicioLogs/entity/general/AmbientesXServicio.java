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
@Table(name = "tbl_ambientes_x_servicio")
public class AmbientesXServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ambiente", nullable = false)
    private Long idAmbiente;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_servicio", nullable = false)
    private Servicio servicio;

    @Size(max = 60)
    @NotNull
    @Column(name = "nombre_ambiente", nullable = false, length = 60)
    private String nombreAmbiente;

    @Size(max = 60)
    @NotNull
    @Column(name = "servidor_aplicacion", nullable = false, length = 60)
    private String servidorAplicacion;

    @Size(max = 60)
    @NotNull
    @Column(name = "sistema_operativo", nullable = false, length = 60)
    private String sistemaOperativo;

    @Size(max = 100)
    @NotNull
    @Column(name = "direccion_ip", nullable = false, length = 100)
    private String direccionIp;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_ambiente", nullable = false)
    private Estado estadoAmbiente;

    @Size(max = 130)
    @NotNull
    @Column(name = "observaciones", nullable = false, length = 130)
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
