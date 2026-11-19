package modelo;

import java.time.LocalDateTime;

public class Revision extends Cita {

	public Revision() {
		super();
	}

	public Revision(Long id, LocalDateTime fechaHora, String anotacion, Enfermeria enfermero) {
		super(id, fechaHora, anotacion, enfermero);
	}

	@Override
	public String toString() {
		return "Revisión [" + super.toString() + "]";
	}
}
