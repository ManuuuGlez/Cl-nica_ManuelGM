package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Intervencion extends Cita {

	private int duracionMinutos;
	private Enfermeria enfermero;
	private List<Cirujano> cirujanos = new ArrayList<>();

	public Intervencion() {
		super();
	}

	public Intervencion(Long id, LocalDateTime fechaHora, String anotacion, int duracionMinutos) {
		super();
		setId(id);
		setFechaHora(fechaHora);
		setAnotaciones(anotacion);
		this.duracionMinutos = duracionMinutos;
	}

	public Intervencion(Long id, LocalDateTime fechaHora, String anotacion, int duracionMinutos, Enfermeria enfermero, List<Cirujano> cirujanos) {
		super();
		setId(id);
		setFechaHora(fechaHora);
		setAnotaciones(anotacion); 
		this.duracionMinutos = duracionMinutos;
		this.enfermero = enfermero;
		this.cirujanos = cirujanos;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public Enfermeria getEnfermero() {
		return enfermero;
	}

	public void setEnfermero(Enfermeria enfermero) {
		this.enfermero = enfermero;
	}

	public List<Cirujano> getCirujanos() {
		return cirujanos;
	}

	public void setCirujanos(List<Cirujano> cirujanos) {
		this.cirujanos = cirujanos;
	}

	@Override
	public String toString() {
		return "Intervencion [duracionMinutos=" + duracionMinutos + ", id=" + getId() + ", fechaHora=" + getFechaHora()
				+ ", anotacion=" + getAnotaciones() + "]";
	}
}