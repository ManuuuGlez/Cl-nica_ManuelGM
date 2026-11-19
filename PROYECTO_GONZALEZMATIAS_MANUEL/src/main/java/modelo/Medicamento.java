package modelo;

import java.io.Serializable;

public class Medicamento implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nombre;
	private String principioActivo;
	private double dosisMaximaDiaria;

	public Medicamento() {
	}

	public Medicamento(Long id, String nombre, String principioActivo, double dosisMaximaDiaria) {
		this.id = id;
		this.nombre = nombre;
		this.principioActivo = principioActivo;
		this.dosisMaximaDiaria = dosisMaximaDiaria;
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

	public String getPrincipioActivo() {
		return principioActivo;
	}

	public void setPrincipioActivo(String principioActivo) {
		this.principioActivo = principioActivo;
	}

	public double getDosisMaximaDiaria() {
		return dosisMaximaDiaria;
	}

	public void setDosisMaximaDiaria(double dosisMaximaDiaria) {
		this.dosisMaximaDiaria = dosisMaximaDiaria;
	}

	@Override
	public String toString() {
		return "Medicamento [Id: " + id + ", Nombre: " + nombre + ", Principio activo: " + principioActivo
				+ ", Dosis máxima diaria: " + dosisMaximaDiaria + " mg]";
	}
}
