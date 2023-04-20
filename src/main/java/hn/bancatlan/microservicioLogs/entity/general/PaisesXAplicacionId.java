package hn.bancatlan.microservicioLogs.entity.general;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PaisesXAplicacionId implements Serializable {
    private static final long serialVersionUID = -1031180368595593034L;
    @Size(max = 10)
    @NotNull
    @Column(name = "id_aplicacion", nullable = false, length = 10)
    private String idAplicacion;

    @Size(max = 5)
    @NotNull
    @Column(name = "id_pais", nullable = false, length = 5)
    private String idPais;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PaisesXAplicacionId entity = (PaisesXAplicacionId) o;
        return Objects.equals(this.idAplicacion, entity.idAplicacion) &&
                Objects.equals(this.idPais, entity.idPais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAplicacion, idPais);
    }

}
