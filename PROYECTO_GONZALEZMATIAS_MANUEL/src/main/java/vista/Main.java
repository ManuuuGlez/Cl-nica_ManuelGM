package vista;

import java.io.IOException;
import java.util.Scanner;

import modelo.Perfil;
import modelo.Sesion;
import servicio.AutenticacionServicio;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static AutenticacionServicio autenticacion = new AutenticacionServicio();

	public static void main(String[] args) {
		int opcion;
		do {
			Sesion sesion = autenticacion.getSesion();
			System.out.println("   CLÍNICA - MENÚ PRINCIPAL");
			System.out.println("Usuario actual: " + sesion.getNombrePersona() + " (" + sesion.getPerfil() + ")");
			System.out.println("________________________________");

			if (sesion.isAutenticado()) {
				opcion = menuUsuario(sesion.getPerfil());
			} else {
				opcion = menuInvitado();
			}
		} while (opcion != 0);

		System.out.println("¡Saliendo del programa. Hasta pronto!");
		sc.close();
	}

	private static int menuInvitado() {
		System.out.println("1. Iniciar sesión (Login)");
		System.out.println("0. Salir del programa");
		int opcion = leerOpcion();

		switch (opcion) {
		case 1:
			login();
			break;
		case 0:
			if (!confirmar("¿Seguro que quieres salir?")) {
				opcion = -1;
			}
			break;
		default:
			System.out.println("Opción no válida.");
		}
		return opcion;
	}

	private static int menuUsuario(Perfil perfil) {
		boolean personal = perfil == Perfil.SECRETARIADO || perfil == Perfil.ADMIN;
		boolean alergias = perfil == Perfil.ENFERMERIA || perfil == Perfil.ADMIN;

		System.out.println("--- OPCIONES DE " + perfil + " ---");
		if (personal) {
			System.out.println("1. Gestionar personal de la clínica (CU2)");
		}
		if (alergias) {
			System.out.println("2. Gestionar alergias y medicamentos (CU3)");
		}
		System.out.println("9. Cerrar sesión (Logout)");
		System.out.println("0. Salir del programa");
		int opcion = leerOpcion();

		if ((opcion == 1 && personal) || (opcion == 2 && alergias)) {
			System.out.println("[Funcionalidad en desarrollo]");
		} else if (opcion == 9) {
			if (confirmar("¿Seguro que quieres cerrar la sesión?")) {
				autenticacion.logout();
				System.out.println("Sesión cerrada correctamente.");
			}
		} else if (opcion == 0) {
			if (!confirmar("¿Seguro que quieres salir?")) {
				opcion = -1;
			}
		} else {
			System.out.println("Opción no válida.");
		}
		return opcion;
	}

	private static void login() {
		System.out.print("Introduce el nombre de usuario: ");
		String usuario = sc.nextLine().trim();
		System.out.print("Introduce la contraseña: ");
		String password = sc.nextLine().trim();

		if (usuario.isEmpty() || password.isEmpty()) {
			System.out.println("Error: el usuario y la contraseña no pueden estar vacíos.");
			return;
		}

		try {
			if (autenticacion.login(usuario, password)) {
				System.out.println("\n¡Bienvenido/a, " + autenticacion.getSesion().getNombrePersona() + "!");
			} else {
				System.out.println("Error: usuario o contraseña incorrectos.");
			}
		} catch (IOException e) {
			System.out.println("Error al leer el fichero de credenciales: " + e.getMessage());
		}
	}

	private static int leerOpcion() {
		System.out.print("Elige una opción: ");
		try {
			return Integer.parseInt(sc.nextLine().trim());
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	private static boolean confirmar(String mensaje) {
		System.out.print(mensaje + " (S/N): ");
		return sc.nextLine().trim().equalsIgnoreCase("S");
	}
}
