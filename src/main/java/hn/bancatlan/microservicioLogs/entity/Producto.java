package hn.bancatlan.microservicioLogs.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Producto")
@Table(name="PRODUCTO")//schema = "dbo"
public class Producto implements Serializable {
	
	private static final long serialVersionUID = 4372705209748254766L;

	@Id
	@Column(name = "ID_PRODUCTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProducto")
    @SequenceGenerator(sequenceName = "SEQ_PRODUCTO", allocationSize = 1, name = "seqProducto")
	private Long id;
	
	@NotEmpty(message = "El nombre es requerido")
	@Size(min = 4, max = 120, message = "El nombre debe tener como mínimo {min} y máximo {max} de caracteres")
	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Positive(message = "El precio debe ser mayor que cero")
	@Column(name = "PRECIO")
	private Double precio;

	@PositiveOrZero(message = "El stock debe ser mayor o igual a cero")
	@Column(name = "STOCK")
	private Integer stock;
	
	@Column(name = "ESTADO")
	private String estado;
}
