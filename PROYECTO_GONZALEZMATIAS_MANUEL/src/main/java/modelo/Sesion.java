package modelo;

public class Sesion {

	private String usuario;
	private String nombrePersona;
	private Perfil perfil;

	public Sesion() {
		cerrarSesion();
	}

	public void iniciarSesion(String usuario, String nombrePersona, Perfil perfil) {
		this.usuario = usuario;
		this.nombrePersona = nombrePersona;
		this.perfil = perfil;
	}

	public void cerrarSesion() {
		usuario = null;
		nombrePersona = "Invitado";
		perfil = Perfil.INVITADO;
	}

	public boolean isAutenticado() {
		return perfil != Perfil.INVITADO;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public Perfil getPerfil() {
		return perfil;
	}
}
