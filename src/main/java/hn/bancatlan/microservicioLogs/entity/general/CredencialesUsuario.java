package hn.bancatlan.microservicioLogs.entity.general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_credenciales_usuarios")
public class CredencialesUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_credencial_usuario", nullable = false)
    private Long idCredUsuario;

    @Size(max = 30)
    @NotNull
    @Column(name = "usuario", nullable = false, length = 30)
    private String usuario;

    @Size(max = 30)
    @NotNull
    @Column(name = "contrasenia", nullable = false, length = 30)
    private String contrasenia;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_usuario", nullable = false)
    private TiposUsuario tipoUsuario;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_usuario", nullable = false)
    private Estado estadoUsuario;

    @Size(max = 255)
    @Column(name = "token_conexion")
    private String tokenConexion;

    @Column(name = "fecha_token")
    private LocalDate fechaToken;

    @Size(max = 15)
    @Column(name = "hora_token", length = 15)
    private String horaToken;

    @Column(name = "extra1")
    private Integer extra1;

    @Size(max = 35)
    @Column(name = "extra2", length = 35)
    private String extra2;

    @Size(max = 65)
    @Column(name = "extra3", length = 65)
    private String extra3;

}
