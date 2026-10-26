package clases;

public class Enfermeria extends Empleado {
    private char categoria; // 'A', 'B' o 'C'

    public Enfermeria() {
        super();
    }

    public Enfermeria(int id, String nombreApellidos, String telefono, String email, String nifNie, String direccion, String usuario, String password, char categoria) {
        super(id, nombreApellidos, telefono, email, nifNie, direccion, usuario, password);
        this.categoria = categoria;
    }

    public char getCategoria() { return categoria; }
    public void setCategoria(char categoria) { this.categoria = categoria; }
}