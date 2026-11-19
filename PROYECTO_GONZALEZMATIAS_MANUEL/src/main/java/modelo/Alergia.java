package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Alergia implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nombre;
	private Medicamento medicamento;

	public Alergia() {
	}

	public Alergia(Long id, String nombre, Medicamento medicamento) {
		this.id = id;
		this.nombre = nombre;
		this.medicamento = medicamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Alergia other = (Alergia) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Alergia [Id: " + id + ", Nombre: " + nombre + ", " + medicamento + "]";
	}
}
