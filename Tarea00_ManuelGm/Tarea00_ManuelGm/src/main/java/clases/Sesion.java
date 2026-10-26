package clases;

public class Sesion {
    private String usuario;
    private String nombrePersona;
    private Perfil perfil;

    public Sesion() {
        cerrarSesion(); // Por defecto inicia como INVITADO
    }

    public void iniciarSesion(String usuario, String nombrePersona, Perfil perfil) {
        this.usuario = usuario;
        this.nombrePersona = nombrePersona;
        this.perfil = perfil;
    }

    public void cerrarSesion() {
        this.usuario = null;
        this.nombrePersona = "Invitado";
        this.perfil = Perfil.INVITADO;
    }

    public String getUsuario() { return usuario; }
    public String getNombrePersona() { return nombrePersona; }
    public Perfil getPerfil() { return perfil; }
}