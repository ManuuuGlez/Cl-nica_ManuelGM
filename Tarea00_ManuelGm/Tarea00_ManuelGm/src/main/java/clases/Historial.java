package clases;

import java.util.LinkedHashSet;
import java.util.Set;

public class Historial {

	private Long nHistorial;
	private String descripcion;

	private Set<Alergia> alergias = new LinkedHashSet<>(); 
	public Historial() {
	}

	public Historial(Long nHistorial, String descripcion) {
		super();
		this.nHistorial = nHistorial;
		this.descripcion = descripcion;
	}

	public Long getnHistorial() {
		return nHistorial;
	}

	public void setnHistorial(Long nHistorial) {
		this.nHistorial = nHistorial;
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
		return "Historial [NHistorial=" + nHistorial + ", Descripcion=" + descripcion + "]";
	}
	
	
	public void mostrarHistorial() {
		System.out.println("Historial: ");
		System.out.println("Nº de historia: " + nHistorial);
		System.out.println("Descripción: " + descripcion);
		for (Alergia alergia : alergias) {
			alergia.mostrarAlergia();
		}
	}

}
