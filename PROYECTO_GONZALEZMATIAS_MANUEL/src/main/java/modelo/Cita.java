package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Cita {

	protected Long id;
	protected LocalDateTime fechaHora;
	protected String anotacion;
	protected Tratamiento tratamiento;
	protected Enfermeria enfermero;

	public Cita() {
	}

	public Cita(Long id, LocalDateTime fechaHora, String anotacion, Enfermeria enfermero) {
		this.id = id;
		this.fechaHora = fechaHora;
		this.anotacion = anotacion;
		this.enfermero = enfermero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getAnotacion() {
		return anotacion;
	}

	public void setAnotacion(String anotacion) {
		this.anotacion = anotacion;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}

	public Enfermeria getEnfermero() {
		return enfermero;
	}

	public void setEnfermero(Enfermeria enfermero) {
		this.enfermero = enfermero;
	}

	@Override
	public String toString() {
		String fecha = fechaHora == null ? "" : fechaHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		return "Id: " + id + ", Fecha y hora: " + fecha + ", Anotación: " + anotacion;
	}
}
