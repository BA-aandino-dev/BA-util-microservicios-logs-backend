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
@Table(name = "tbl_bitacora")
public class Bitacora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bitacora", nullable = false)
    private Long idBitacora;

    @Size(max = 255)
    @Column(name = "token")
    private String token;

    @Size(max = 10)
    @Column(name = "id_microservicio", length = 10)
    private String idMicroservicio;

    @Size(max = 70)
    @Column(name = "id_peticion_unica", length = 70)
    private String idPeticionUnica;

    @Size(max = 50)
    @Column(name = "clase_bitacora", length = 50)
    private String claseBitacora;

    @Size(max = 50)
    @Column(name = "metodo_bitacora", length = 50)
    private String metodoBitacora;

    @Lob
    @Column(name = "data_bitacora")
    private String dataBitacora;

    @Size(max = 100)
    @Column(name = "tipo_registro", length = 100)
    private String tipoRegistro;

    @Size(max = 15)
    @Column(name = "hora", length = 15)
    private String hora;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "extra1")
    private Integer extra1;

    @Size(max = 35)
    @Column(name = "extra2", length = 35)
    private String extra2;

    @Size(max = 65)
    @Column(name = "extra3", length = 65)
    private String extra3;

}
