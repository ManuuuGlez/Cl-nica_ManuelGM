package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente {

	private Long id;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String telefono;
	private String email;
	private String direccion;
	private String nifNie;

	private Historial historial; 

	private List<Tratamiento> tratamientos = new ArrayList<>(); 

	public Paciente() {
	}

	public Paciente(Long id, String nombre, LocalDate fechaNacimiento, String telefono, String email,
			String direccion, String nifNie, Historial historial) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
		this.nifNie = nifNie;
		this.historial = historial;
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNifNie() {
		return nifNie;
	}

	public void setNifNie(String nifNie) {
		this.nifNie = nifNie;
	}

	public Historial getHistorial() {
		return historial;
	}

	public void setHistorial(Historial historial) {
		this.historial = historial;
	}

	public List<Tratamiento> getTratamientos() {
		return tratamientos;
	}

	public void setTratamientos(List<Tratamiento> tratamientos) {
		this.tratamientos = tratamientos;
	}

	public void addTratamiento(Tratamiento tratamiento) {
		tratamientos.add(tratamiento);
		tratamiento.setPaciente(this);
	}

	@Override
	public String toString() {
		return "Paciente [Id=" + id + ", Nombre=" + nombre + ", FechaNacimiento=" + fechaNacimiento + ", Telefono="
				+ telefono + ", Email=" + email + ", Direccion=" + direccion + ", NifNie=" + nifNie + "]";
	}

	public void mostrarPaciente() {
		System.out.println("Paciente: ");
		System.out.println("Id: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		System.out.println("Teléfono: " + telefono);
		System.out.println("Email: " + email);
		System.out.println("Dirección: " + direccion);
		System.out.println("NIF/NIE: " + nifNie);
		historial.mostrarHistorial();
		for (Tratamiento t : tratamientos) {
			t.mostrarTratamiento();
		}
	}

}
