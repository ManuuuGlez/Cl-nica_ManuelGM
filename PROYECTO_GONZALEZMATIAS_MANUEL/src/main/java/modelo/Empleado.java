package modelo;

public abstract class Empleado {

	protected Long id;
	protected String nombreApellidos;
	protected String telefono;
	protected String email;
	protected String nifNie;
	protected String direccion;
	protected String usuario;
	protected String password;

	public Empleado() {
	}

	public Empleado(Long id, String nombreApellidos, String telefono, String email, String nifNie, String direccion,
			String usuario, String password) {
		this.id = id;
		this.nombreApellidos = nombreApellidos;
		this.telefono = telefono;
		this.email = email;
		this.nifNie = nifNie;
		this.direccion = direccion;
		this.usuario = usuario;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
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

	public String getNifNie() {
		return nifNie;
	}

	public void setNifNie(String nifNie) {
		this.nifNie = nifNie;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Nombre: " + nombreApellidos + ", Teléfono: " + telefono + ", Email: " + email
				+ ", NIF/NIE: " + nifNie + ", Dirección: " + direccion + ", Usuario: " + usuario;
	}
}
