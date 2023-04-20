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
public class AplXMicroservicioId implements Serializable {
    private static final long serialVersionUID = -2934526492761628076L;
    @Size(max = 10)
    @NotNull
    @Column(name = "id_aplicacion", nullable = false, length = 10)
    private String idAplicacion;

    @Size(max = 10)
    @NotNull
    @Column(name = "id_microservicio", nullable = false, length = 10)
    private String idMicroservicio;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AplXMicroservicioId entity = (AplXMicroservicioId) o;
        return Objects.equals(this.idAplicacion, entity.idAplicacion) &&
                Objects.equals(this.idMicroservicio, entity.idMicroservicio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAplicacion, idMicroservicio);
    }

}
