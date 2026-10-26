package clases;

import java.time.LocalDateTime;

public class Revision extends Cita {
	
	private Enfermeria enfermero;

	public Revision() {
		super();
	}

	public Revision(Long id, LocalDateTime fechaHora, String anotacion, Enfermeria enfermero) {
		super();
		setId(id);
		setFechaHora(fechaHora);
		setAnotaciones(anotacion);
		this.enfermero = enfermero;
	}

	public Enfermeria getEnfermero() {
		return enfermero;
	}

	public void setEnfermero(Enfermeria enfermero) {
		this.enfermero = enfermero;
	}

	@Override
	public String toString() {
		return "Revision [id=" + getId() + ", fechaHora=" + getFechaHora() + ", anotacion=" + getAnotaciones() + "]";
	}
}