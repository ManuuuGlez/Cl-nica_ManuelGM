package clases;

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
		super();
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
		return "Medicamento [id=" + id + ", nombre=" + nombre + ", principioActivo=" + principioActivo
				+ ", dosisMaximaDiaria=" + dosisMaximaDiaria + "]";
	}

	public void mostrarMedicamento() {
		System.out.println("Medicamento: ");
		System.out.println("Id: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Principio Activo: " + principioActivo);
		System.out.println("Dosis Maxima Diaria: " + dosisMaximaDiaria);
	}

}