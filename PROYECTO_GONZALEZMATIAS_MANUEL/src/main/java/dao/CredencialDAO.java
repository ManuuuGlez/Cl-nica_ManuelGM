package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import modelo.Credencial;
import modelo.Perfil;

public class CredencialDAO {

	private String fichero;

	public CredencialDAO(String fichero) {
		this.fichero = fichero;
	}

	public Credencial buscarPorUsuario(String usuario) throws IOException {
		try (BufferedReader br = Files.newBufferedReader(Paths.get(fichero), StandardCharsets.UTF_8)) {
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split("\\|");
				if (partes.length == 4 && partes[0].trim().equals(usuario)) {
					Perfil perfil = convertirPerfil(partes[3].trim());
					if (perfil != null) {
						return new Credencial(partes[0].trim(), partes[1].trim(), partes[2].trim(), perfil);
					}
				}
			}
		}
		return null;
	}

	private Perfil convertirPerfil(String texto) {
		switch (texto.toLowerCase()) {
		case "secretariado":
			return Perfil.SECRETARIADO;
		case "enfermeria":
			return Perfil.ENFERMERIA;
		case "cirugia":
			return Perfil.CIRUGIA;
		default:
			return null;
		}
	}
}
