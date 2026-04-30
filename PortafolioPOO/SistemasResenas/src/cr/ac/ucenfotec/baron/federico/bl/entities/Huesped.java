package cr.ac.ucenfotec.baron.federico.bl.entities;

import java.time.LocalDate;

/**
 * Representa un huésped del Airbnb Tierra Vital.
 * Hereda de Persona e implementa IGestionable.
 * @author Federico Barón
 * @version 2.0
 */

public class Huesped extends Persona implements IGestionable {

    private static int numeroVisitante;
    private int idHuesped;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private Reserva reserva;

    public Huesped() {
        super("", "", "");
    }

    public Huesped(String nombre, String nacionalidad, LocalDate fechaNacimiento,
                   String correoElectronico, String numeroTelefono, Reserva reserva) {
        super(nombre, correoElectronico, numeroTelefono);
        this.numeroVisitante = numeroVisitante + 1;
        this.idHuesped = numeroVisitante;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.reserva = reserva;
    }

    public Reserva getReserva() { return reserva; }


    @Override
    public String obtenerRol() {
        return "Huésped";
    }

    public String obtenerInformacion() {
        return "Huésped #" + idHuesped + " - " + getNombre() + " - " + nacionalidad;
    }


    @Override
    public boolean esValido() {
        return getNombre() != null && !getNombre().isEmpty()
                && nacionalidad != null && !nacionalidad.isEmpty();
    }
}