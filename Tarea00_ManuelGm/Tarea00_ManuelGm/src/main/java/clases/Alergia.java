package clases;

import java.io.Serializable;

public class Alergia implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nombre;
	private Medicamento medicamento;

	public Alergia() {
	}

	public Alergia(Long id, String nombre, Medicamento medicamento) {
		super();
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
	public String toString() {
		return "Alergia [id=" + id + ", nombre=" + nombre + "]";
	}

	public void mostrarAlergia() {
		System.out.println("Alergia: ");
		System.out.println("Id: " + id);
		System.out.println("Nombre: " + nombre);
		medicamento.mostrarMedicamento();
	}

}