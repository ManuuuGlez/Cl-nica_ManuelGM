package clases;

import java.util.ArrayList;
import java.util.List;

public class Cirujano extends Empleado {
    private List<Especialidad> especialidades = new ArrayList<>();

    public Cirujano() {
        super();
    }

    public Cirujano(int id, String nombreApellidos, String telefono, String email, String nifNie, String direccion, String usuario, String password, List<Especialidad> especialidades) {
        super(id, nombreApellidos, telefono, email, nifNie, direccion, usuario, password);
        this.especialidades = especialidades;
    }

    public List<Especialidad> getEspecialidades() { return especialidades; }
    public void setEspecialidades(List<Especialidad> especialidades) { this.especialidades = especialidades; }
}