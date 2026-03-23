package cr.ac.ucenfotec.baron.federico.bl.dl;

import cr.ac.ucenfotec.baron.federico.bl.entities.Huesped;
import cr.ac.ucenfotec.baron.federico.bl.entities.Reserva;

import java.util.ArrayList;

public class Data {

    private ArrayList<Huesped> listaHuespedes;
    public Data (){

    this.listaHuespedes = new ArrayList<>();

}
    public void agregarHuesped(Huesped huesped) {

        listaHuespedes.add(huesped);

    }
    public ArrayList<Huesped> listarHuespedes () {
        return listaHuespedes;

    }

}
