package cr.ac.ucenfotec.baron.federico.bl.logic;

import cr.ac.ucenfotec.baron.federico.bl.dl.Data;
import cr.ac.ucenfotec.baron.federico.bl.entities.*;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.lang.System.out;

public class Service {

    private Data data = new Data();

    public Huesped registrarHuesped(String nombre, String nacionalidad, LocalDate fechaNacimiento, String correoElectronico, String numeroTelefono, LocalDate fechaEntrada, LocalDate fechaSalida, Casa casa, Anfitrion anfitrion, double pagoReserva, int calificacionGeneral, int calificacionLimpieza, int calificacionSeguridad, int calificacionAnfitrion, String comentarios) {

        Resena tmpResena = new Resena(calificacionGeneral, calificacionLimpieza, calificacionSeguridad, calificacionAnfitrion, comentarios);
        Reserva tmpReserva = new Reserva(fechaEntrada, fechaSalida, casa, anfitrion, pagoReserva, tmpResena);
        Huesped tmpHuesped = new Huesped(nombre, nacionalidad, fechaNacimiento, correoElectronico, numeroTelefono, tmpReserva);

        data.agregarHuesped(tmpHuesped);

        return tmpHuesped;
    }
    public ArrayList<Huesped>listarHuespedesPorCasa (Casa casa) {

        ArrayList<Huesped> lista = new ArrayList<>();

        for (Huesped h : data.listarHuespedes()) {
            if (h.getReserva().getCasa() == casa) {
                lista.add(h);

            }

        }
        return lista;
    }
    public ArrayList<Huesped> listarHuespedesPorMes(int mes) {
        ArrayList<Huesped> lista = new ArrayList<>();
        for (Huesped h : data.listarHuespedes()) {
            if (h.getReserva().getFechaEntrada().getMonthValue() == mes) {
                lista.add(h);
            }
        }
        return lista;
    }
    public ArrayList<Huesped> listarHuespedes () {
        return data.listarHuespedes();

    }

    }



