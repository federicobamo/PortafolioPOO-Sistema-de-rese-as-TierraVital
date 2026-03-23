package cr.ac.ucenfotec.baron.federico.bl.entities;

import java.time.LocalDate;

public class Huesped {

    private static int numeroVisitante;
    private int idHuesped;
    private String nombre;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private String correoElectronico;
    private String numeroTelefono;
    private Reserva reserva;
public Huesped (){

}
    public Huesped( String nombre, String nacionalidad, LocalDate fechaNacimiento, String correoElectronico, String numeroTelefono, Reserva reserva) {

        this.numeroVisitante = numeroVisitante + 1;
        this.idHuesped = numeroVisitante;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
        this.reserva = reserva;
    }

    public static int getNumeroVisitante() {
        return numeroVisitante;
    }
    public int getIdHuesped() {
        return idHuesped;
    }
    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
    public Reserva getReserva() {
        return reserva;
    }
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    @Override
    public String toString() {
        return "\n================================" +
                "\n  VISITANTE #" + idHuesped +
                "\n  Nombre:       " + nombre +
                "\n  Nacionalidad: " + nacionalidad +
                "\n  Fecha Nacimiento .:   " + fechaNacimiento +
                "\n  Correo:       " + correoElectronico +
                "\n  Teléfono:     " + numeroTelefono +
                "\n  Reserva:      " + reserva +
                "\n================================";
    }
}

