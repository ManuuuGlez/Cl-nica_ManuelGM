package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tratamiento {

	
	private Long id;
	private String nombre;
	private LocalDate fechaInicio;
	private boolean consentimiento;

	private Paciente paciente; 

	private List<Cita> citas = new ArrayList<>(); 

	public Tratamiento() {
	}

	public Tratamiento(Long id, String nombre, LocalDate fechaInicio, boolean consentimiento, Paciente paciente) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.consentimiento = consentimiento;
		this.paciente = paciente;
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
		return "Tratamiento [Id=" + id + ", Nombre=" + nombre + ", FechaInicio=" + fechaInicio + ", Consentimiento="
				+ consentimiento + "]";
	}

	public void mostrarTratamiento() {
		System.out.println("Tratamiento: ");
		System.out.println("Id: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de inicio: " + fechaInicio);
		System.out.println("Consentimiento: " + consentimiento);
		for (Cita c : citas) {
			c.mostrarCita();
		}
	}

}
