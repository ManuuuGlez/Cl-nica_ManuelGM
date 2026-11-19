package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Intervencion extends Cita {

	private int duracionMinutos;
	private List<Cirujano> cirujanos = new ArrayList<>();

	public Intervencion() {
		super();
	}

	public Intervencion(Long id, LocalDateTime fechaHora, String anotacion, Enfermeria enfermero,
			int duracionMinutos) {
		super(id, fechaHora, anotacion, enfermero);
		this.duracionMinutos = duracionMinutos;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public List<Cirujano> getCirujanos() {
		return cirujanos;
	}

	public void setCirujanos(List<Cirujano> cirujanos) {
		this.cirujanos = cirujanos;
	}

	public boolean addCirujano(Cirujano cirujano) {
		if (cirujanos.size() >= 2) {
			return false;
		}
		cirujanos.add(cirujano);
		return true;
	}

	@Override
	public String toString() {
		return "Intervención [" + super.toString() + ", Duración: " + duracionMinutos + " min, Cirujanos: "
				+ cirujanos.size() + "]";
	}
}
