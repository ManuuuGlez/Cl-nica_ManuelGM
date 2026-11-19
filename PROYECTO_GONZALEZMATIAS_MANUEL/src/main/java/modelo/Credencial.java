package modelo;

public class Credencial {

	private String usuario;
	private String password;
	private String nombrePersona;
	private Perfil perfil;

	public Credencial() {
	}

	public Credencial(String usuario, String password, String nombrePersona, Perfil perfil) {
		this.usuario = usuario;
		this.password = password;
		this.nombrePersona = nombrePersona;
		this.perfil = perfil;
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

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
}
