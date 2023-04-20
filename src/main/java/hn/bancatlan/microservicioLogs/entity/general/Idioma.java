package hn.bancatlan.microservicioLogs.entity.general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_idioma")
public class Idioma {
    @Id
    @Size(max = 10)
    @Column(name = "id_idioma", nullable = false, length = 10)
    private String idIdioma;

    @Size(max = 30)
    @NotNull
    @Column(name = "descripcion", nullable = false, length = 30)
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
