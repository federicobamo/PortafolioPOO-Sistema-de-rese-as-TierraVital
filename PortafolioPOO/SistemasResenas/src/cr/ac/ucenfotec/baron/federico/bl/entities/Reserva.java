package cr.ac.ucenfotec.baron.federico.bl.entities;

import java.time.LocalDate;

public class Reserva {

    private static int numeroReserva;
    private int idReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Casa casa;
    private Anfitrion anfitrion;
    private double pagoReserva;
    private Resena resena;

    public Reserva() {
    }

    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, Casa casa,
                   Anfitrion anfitrion, double pagoReserva, Resena resena) {
        this.numeroReserva = numeroReserva + 1;
        this.idReserva = numeroReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.casa = casa;
        this.anfitrion = anfitrion;
        this.pagoReserva = pagoReserva;
        this.resena = resena;
    }
    public static int getNumeroReserva() {
        return numeroReserva;
    }

    public static void setNumeroReserva(int numeroReserva) {
        Reserva.numeroReserva = numeroReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public Casa getCasa() {
        return casa;
    }
    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    public Anfitrion getAnfitrion() {
        return anfitrion;
    }
    public void setAnfitrion(Anfitrion anfitrion) {
        this.anfitrion = anfitrion;
    }
    public double getPagoReserva() {
        return pagoReserva;
    }
    public void setPagoReserva(double pagoReserva) {
        this.pagoReserva = pagoReserva;
    }
    public Resena getResena() {
        return resena;
    }
    public void setResena(Resena resena) {
        this.resena = resena;
    }

    @Override
    public String toString() {
        return "\n  --- Reserva ---" +
                "\n  Casa:         " + casa +
                "\n  Entrada:      " + fechaEntrada +
                "\n  Salida:       " + fechaSalida +
                "\n  Anfitrión:    " + anfitrion +
                "\n  Pago:         $" + pagoReserva +
                "\n  Reseña:       " + resena;

    }
}