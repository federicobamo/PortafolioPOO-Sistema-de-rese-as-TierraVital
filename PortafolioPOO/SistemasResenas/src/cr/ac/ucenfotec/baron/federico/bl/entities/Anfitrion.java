package cr.ac.ucenfotec.baron.federico.bl.entities;

public class Anfitrion extends Persona {

    private String rol;

    public Anfitrion() { super("", "", ""); }

    public Anfitrion(String nombre, String correoElectronico,
                     String numeroTelefono, String rol) {
        super(nombre, correoElectronico, numeroTelefono);
        this.rol = rol;
    }

    @Override
    public String obtenerRol() {
        return rol;
    }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    @Override
    public String toString() {
        return super.toString() + ", Rol: " + rol;
    }
}