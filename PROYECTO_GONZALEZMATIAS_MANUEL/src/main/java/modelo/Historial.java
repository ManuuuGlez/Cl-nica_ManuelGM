package modelo;

import java.util.HashSet;
import java.util.Set;

public class Historial {

	private Long numHistoria;
	private String descripcion;
	private Set<Alergia> alergias = new HashSet<>();

	public Historial() {
	}

	public Historial(Long numHistoria, String descripcion) {
		this.numHistoria = numHistoria;
		this.descripcion = descripcion;
	}

	public Long getNumHistoria() {
		return numHistoria;
	}

	public void setNumHistoria(Long numHistoria) {
		this.numHistoria = numHistoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Alergia> getAlergias() {
		return alergias;
	}

	public void setAlergias(Set<Alergia> alergias) {
		this.alergias = alergias;
	}

	public void addAlergia(Alergia alergia) {
		alergias.add(alergia);
	}

	@Override
	public String toString() {
		return "Historial [Nº historia: " + numHistoria + ", Descripción: " + descripcion + ", Alergias: " + alergias
				+ "]";
	}
}
