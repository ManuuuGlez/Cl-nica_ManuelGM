package modelo;

public class Secretariado extends Empleado {

	private int aniosExperiencia;

	public Secretariado() {
		super();
	}

	public Secretariado(Long id, String nombreApellidos, String telefono, String email, String nifNie,
			String direccion, String usuario, String password, int aniosExperiencia) {
		super(id, nombreApellidos, telefono, email, nifNie, direccion, usuario, password);
		this.aniosExperiencia = aniosExperiencia;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		return "Secretariado [" + super.toString() + ", Años de experiencia: " + aniosExperiencia + "]";
	}
}
