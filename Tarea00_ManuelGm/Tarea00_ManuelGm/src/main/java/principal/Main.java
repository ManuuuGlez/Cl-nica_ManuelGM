package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

import clases.Perfil;
import clases.Sesion;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sesion sesion = new Sesion();
        int opcion = 0;

        do {
            System.out.println("\n========================================");
            System.out.println("   CLÍNICA DENTAL - MENÚ PRINCIPAL");
            System.out.println("========================================");
            System.out.println("Usuario actual: " + sesion.getNombrePersona() + " (" + sesion.getPerfil() + ")");
            System.out.println("----------------------------------------");

            if (sesion.getPerfil() == Perfil.INVITADO) {
                System.out.println("1. Iniciar Sesión (Login)");
                System.out.println("0. Salir del programa");
                System.out.print("Elige una opción: ");
                
                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    scanner.nextLine(); // Limpia
                } else {
                    scanner.nextLine();
                    opcion = -1;
                }

                switch (opcion) {
                    case 1:
                        realizarLogin(scanner, sesion);
                        break;
                    case 0:
                        System.out.println("¡Saliendo del programa. Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

            } else {
                mostrarMenuRol(sesion);
                System.out.println("9. Cerrar Sesión (Logout)");
                System.out.println("0. Salir del programa");
                System.out.print("Elige una opción: ");

                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    scanner.nextLine();
                    opcion = -1;
                }

                if (opcion == 9) {
                    sesion.cerrarSesion();
                    System.out.println("Sesión cerrada correctamente.");
                } else if (opcion == 0) {
                    System.out.println("¡Saliendo del programa. Hasta pronto!");
                } else {
                    ejecutarOpcionRol(sesion, opcion, scanner);
                }
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void realizarLogin(Scanner scanner, Sesion sesion) {
        System.out.print("Introduce el nombre de usuario: ");
        String user = scanner.nextLine().trim();
        System.out.print("Introduce la contraseña: ");
        String pass = scanner.nextLine().trim();

        if (user.isEmpty() || pass.isEmpty()) {
            System.out.println("Error: Los campos de usuario y contraseña no pueden estar vacíos.");
            return;
        }

        // 1. Comprobar si es Administrador mediante application.properties
        if (comprobarAdmin(user, pass)) {
            sesion.iniciarSesion(user, "Administrador General", Perfil.ADMIN);
            System.out.println("\n¡Bienvenido/a, Administrador General!");
            return;
        }

        // 2. Comprobar en credenciales.txt para Secretariado y Enfermería
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader("credenciales.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
            	
                // Formato esperado en el txt: usuario|password|nombre persona|perfil
                String[] partes = linea.split("\\|");
                if (partes.length == 4) {
                    String ficheroUser = partes[0].trim();
                    String ficheroPass = partes[1].trim();
                    String ficheroNombre = partes[2].trim();
                    String ficheroPerfil = partes[3].trim().toLowerCase();

                    if (ficheroUser.equals(user) && ficheroPass.equals(pass)) {
                        encontrado = true;
                        Perfil perfil = Perfil.INVITADO;
                        if (ficheroPerfil.contains("secretariado")) {
                            perfil = Perfil.SECRETARIADO;
                        } else if (ficheroPerfil.contains("enfermeria")) {
                            perfil = Perfil.ENFERMERIA;
                        }

                        sesion.iniciarSesion(user, ficheroNombre, perfil);
                        System.out.println("\n¡Bienvenido/a, " + ficheroNombre + "!");
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero de credenciales: " + e.getMessage());
        }

        if (!encontrado && sesion.getPerfil() == Perfil.INVITADO) {
            System.out.println("Error: Usuario o contraseña incorrectos.");
        }
    }

    private static boolean comprobarAdmin(String user, String pass) {
        Properties props = new Properties();
        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input != null) {
                props.load(input);
                String adminUser = props.getProperty("admin.user", "admin");
                String adminPass = props.getProperty("admin.password", "admin");
                return adminUser.equals(user) && adminPass.equals(pass);
            }
        } catch (IOException e) {
        }
        return "admin".equals(user) && "admin".equals(pass);
    }

    private static void mostrarMenuRol(Sesion sesion) {
        System.out.println("--- OPCIONES DE " + sesion.getPerfil() + " ---");
        if (sesion.getPerfil() == Perfil.SECRETARIADO || sesion.getPerfil() == Perfil.ADMIN) {
            System.out.println("1. Gestionar personal de la clínica (CU2)");
        }
        if (sesion.getPerfil() == Perfil.ENFERMERIA || sesion.getPerfil() == Perfil.ADMIN) {
            System.out.println("2. Gestionar alergias y medicamentos (CU3)");
        }
    }

    private static void ejecutarOpcionRol(Sesion sesion, int opcion, Scanner scanner) {
        System.out.println("\n[Funcionalidad en desarrollo para la siguiente tarea]");
    }
}