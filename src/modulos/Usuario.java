package modulos;

public abstract class Usuario {
    protected String nombre;
    protected String correo;
    protected String tipoUsuario;

    public Usuario(String nombre, String correo, String tipoUsuario) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (nombre.length() < 5) {
            throw new IllegalArgumentException("El nombre debe contener al menos 5 caracteres");
        }
        if (correo == null || !correo.contains("@") || !correo.endsWith(".com")) {
            throw new IllegalArgumentException("Formato de correo inválido");
        }
        this.nombre = nombre;
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
    }

    public abstract void mostrarMenu();

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', correo='" + correo + "', tipoUsuario='" + tipoUsuario + "'}";
    }

    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public String getTipoUsuario() { return tipoUsuario; }
}
