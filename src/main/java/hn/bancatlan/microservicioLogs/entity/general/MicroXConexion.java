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
@Table(name = "tbl_micro_x_conexion", uniqueConstraints = {
        @UniqueConstraint(name = "tbl_micro_x_conex_U_INDEX1", columnNames = {"id_conexion", "id_microservicio", "id_estado", "id_aplicacion", "nombre_metodo"})
})
public class MicroXConexion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_microservicio_conexion", nullable = false)
    private Long idMicroConexion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_conexion", nullable = false)
    private DatosConexion datosConexion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_microservicio", nullable = false)
    private Microservicio microservicio;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estado", nullable = false)
    private Estado estado;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_aplicacion", nullable = false)
    private Aplicacion aplicacion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_credencial_usuario", nullable = false)
    private CredencialesUsuario credencialUsuario;

    @Size(max = 512)
    @NotNull
    @Column(name = "url", nullable = false, length = 512)
    private String url;

    @Size(max = 25)
    @NotNull
    @Column(name = "ip", nullable = false, length = 25)
    private String ip;

    @Size(max = 10)
    @NotNull
    @Column(name = "puerto", nullable = false, length = 10)
    private String puerto;

    @Size(max = 10)
    @Column(name = "tipo_metodo", length = 10)
    private String tipoMetodo;

    @Size(max = 50)
    @Column(name = "nombre_metodo", length = 50)
    private String nombreMetodo;

    @Size(max = 10)
    @Column(name = "tipo_consumo", length = 10)
    private String tipoConsumo;

    @Column(name = "extra1")
    private Integer extra1;

    @Size(max = 35)
    @Column(name = "extra2", length = 35)
    private String extra2;

    @Size(max = 65)
    @Column(name = "extra3", length = 65)
    private String extra3;

}
