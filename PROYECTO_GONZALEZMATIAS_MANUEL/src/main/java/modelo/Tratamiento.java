package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tratamiento {

	private Long id;
	private String nombre;
	private LocalDate fechaInicio;
	private boolean consentimiento;
	private String informe = "";
	private Paciente paciente;
	private List<Cita> citas = new ArrayList<>();

	public Tratamiento() {
	}

	public Tratamiento(Long id, String nombre, LocalDate fechaInicio, boolean consentimiento) {
		this.id = id;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.consentimiento = consentimiento;
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

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public boolean isConsentimiento() {
		return consentimiento;
	}

	public void setConsentimiento(boolean consentimiento) {
		this.consentimiento = consentimiento;
	}

	public String getInforme() {
		return informe;
	}

	public void setInforme(String informe) {
		this.informe = informe;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public void addCita(Cita cita) {
		citas.add(cita);
		cita.setTratamiento(this);
	}

	@Override
	public String toString() {
		return "Tratamiento [Id: " + id + ", Nombre: " + nombre + ", Fecha de inicio: " + fechaInicio
				+ ", Consentimiento: " + (consentimiento ? "Sí" : "No") + "]";
	}
}
