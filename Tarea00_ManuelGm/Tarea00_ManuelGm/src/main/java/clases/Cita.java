package clases;

import java.time.LocalDateTime;

public abstract class Cita {

	protected Long id;
	protected LocalDateTime fechaHora;
	protected String anotaciones;
	protected Tratamiento tratamiento; 

	public Cita() {
	}

	public Cita(Long id, LocalDateTime fechaHora, String anotaciones, Tratamiento tratamiento) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.anotaciones = anotaciones;
		this.tratamiento = tratamiento;
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

	public String getAnotaciones() {
		return anotaciones;
	}

	public void setAnotaciones(String anotaciones) {
		this.anotaciones = anotaciones;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}

	@Override
	public String toString() {
		return "Cita [Id=" + id + ", FechaHora=" + fechaHora + ", Anotaciones=" + anotaciones + "]";
	}

	
	public void mostrarCita() {
		System.out.println("Cita: ");
		System.out.println("Id: " + id);
		System.out.println("Fecha y hora: " + fechaHora);
		System.out.println("Anotaciones: " + anotaciones);
	}

}
