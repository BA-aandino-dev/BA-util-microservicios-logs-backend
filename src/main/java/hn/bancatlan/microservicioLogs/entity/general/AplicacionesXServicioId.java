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
public class AplicacionesXServicioId implements Serializable {
    private static final long serialVersionUID = 1381080017538077000L;
    @Size(max = 10)
    @NotNull
    @Column(name = "id_aplicacion", nullable = false, length = 10)
    private String idAplicacion;

    @Size(max = 10)
    @NotNull
    @Column(name = "id_servicio", nullable = false, length = 10)
    private String idServicio;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AplicacionesXServicioId entity = (AplicacionesXServicioId) o;
        return Objects.equals(this.idAplicacion, entity.idAplicacion) &&
                Objects.equals(this.idServicio, entity.idServicio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAplicacion, idServicio);
    }

}
