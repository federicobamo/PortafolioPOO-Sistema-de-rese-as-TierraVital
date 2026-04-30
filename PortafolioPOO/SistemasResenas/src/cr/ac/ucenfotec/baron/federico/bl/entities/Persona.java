package cr.ac.ucenfotec.baron.federico.bl.entities;
/**
 * Clase abstracta base del sistema Tierra Vital.
 * @author Federico Barón
 * @version 2.0
 */

public abstract class Persona {

    private String nombre;
    private String correoElectronico;
    private String numeroTelefono;

    /**
     * @param nombre nombre de la persona
     * @param correoElectronico correo de la persona
     * @param numeroTelefono teléfono de la persona
     */
    public Persona(String nombre, String correoElectronico, String numeroTelefono) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public abstract String obtenerRol();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Correo: " + correoElectronico + ", Teléfono: " + numeroTelefono;
    }
}