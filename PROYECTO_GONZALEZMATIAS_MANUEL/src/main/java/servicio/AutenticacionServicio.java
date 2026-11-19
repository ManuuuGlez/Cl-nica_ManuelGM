package servicio;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import dao.CredencialDAO;
import modelo.Credencial;
import modelo.Perfil;
import modelo.Sesion;

public class AutenticacionServicio {

	private Sesion sesion = new Sesion();
	private Properties propiedades = new Properties();
	private CredencialDAO credencialDAO;

	public AutenticacionServicio() {
		try (InputStream in = getClass().getClassLoader().getResourceAsStream("application.properties")) {
			if (in != null) {
				propiedades.load(in);
			}
		} catch (IOException e) {
			System.out.println("No se ha podido leer application.properties");
		}
		credencialDAO = new CredencialDAO(propiedades.getProperty("fichero.credenciales", "credenciales.txt"));
	}

	public boolean login(String usuario, String password) throws IOException {
		String adminUsuario = propiedades.getProperty("admin.usuario");
		String adminPassword = propiedades.getProperty("admin.password");

		if (usuario.equals(adminUsuario) && password.equals(adminPassword)) {
			sesion.iniciarSesion(usuario, "Administrador General", Perfil.ADMIN);
			return true;
		}

		Credencial c = credencialDAO.buscarPorUsuario(usuario);
		if (c != null && c.getPassword().equals(password)) {
			sesion.iniciarSesion(c.getUsuario(), c.getNombrePersona(), c.getPerfil());
			return true;
		}
		return false;
	}

	public void logout() {
		sesion.cerrarSesion();
	}

	public Sesion getSesion() {
		return sesion;
	}
}
