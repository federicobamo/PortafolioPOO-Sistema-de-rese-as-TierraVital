package cr.ac.ucenfotec.baron.federico.ui;

import cr.ac.ucenfotec.baron.federico.bl.entities.*;
import cr.ac.ucenfotec.baron.federico.bl.logic.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;


public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Service service = new Service();

    public static void seleccionarUsuario() throws IOException {
        int opcion = -1;
        do {
            out.println("¿Quién accede al sistema?");
            out.println("1. Huésped");
            out.println("2. Dueño");
            out.println("0. Salir");
            opcion = Integer.parseInt(in.readLine());

            switch(opcion) {
                case(1): mostrarMenu(); break;
                case(2): menuDuenos(); break;
                case(0): out.println("¡Hasta luego!"); break;
            }
        } while (opcion != 0);
    }
    public static void mostrarMenu() throws IOException {

        out.println("------------------------------------------");
        out.println("En Tierra Vital nos interesa conocer su opinión ");
        out.println("Le interesa llenar una encuesta de satisfacción? ");
        out.println("1. SI");
        out.println("2. NO");
        out.println("------------------------------------------");

        int opcionInteres = Integer.parseInt(in.readLine());

        if (opcionInteres == 1) {
            registrarHuesped();
        } else {
            out.println("Muchas gracias por su visita a Tierra Vital");
            out.println("¡Espero que vuelva pronto!");
        }
    }
    public static void menuDuenos() throws IOException {
        int opcion = -1;
        do {
            out.println("----- Menu Dueños -----");
            out.println("1. Visitantes por casa");
            out.println("2. Visitas por mes");
            out.println("0. Salir");
            out.println("Digite una opción: ");
            opcion = Integer.parseInt(in.readLine());

            switch (opcion) {
                case(1):
                    listarPorCasa();
                    break;
                case(2):
                    listarPorMes();
                    break;
                case(0):
                    out.println("Saliendo...");
                    break;
            }
        } while (opcion != 0);
    }
    public static void registrarHuesped() throws IOException {


        String nombre;
        String nacionalidad;
        LocalDate fechaNacimiento;
        String correoElectronico;
        String numerotelefono;


        out.println("------- Registro Huesped -------");
        out.println("Nombre: ");
        nombre = in.readLine();
        out.println("Nacionalidad: ");
        nacionalidad = in.readLine();
        out.println("Fecha Nacimiento: (AAAA-MM-DD)");
        fechaNacimiento = LocalDate.parse(in.readLine());
        out.println("Correo Electronico: ");
        correoElectronico = in.readLine();
        out.println("Numero telefono: ");
        numerotelefono = in.readLine();


        // ----------------- -----------------------------------------------

        LocalDate fechaEntrada;
        LocalDate fechaSalida;
        Casa casa = null;
        Anfitrion anfition = null;
        double pagoReserva;
        int menuCasa;
        int menuAnfitrion;

        out.println("------- Registro de la Reserva -------");

        out.println("Fecha de entrada: (AAAA-MM-DD)");
        fechaEntrada = LocalDate.parse(in.readLine());
        out.println("Fecha de salida: (AAAA-MM-DD)");
        fechaSalida = LocalDate.parse(in.readLine());

        out.println("Casa: ");
        out.println("1. Casa #1 ");
        out.println("2. Casa #2");
        out.println("3. Casa #3");
        menuCasa = Integer.parseInt(in.readLine());

        switch (menuCasa) {

            case (1):

                casa = Casa.CASA_1;
                break;

            case (2):
                casa = Casa.CASA_2;
                break;

            case (3):
                casa = Casa.CASA_3;
                break;
        }

        out.println("Anfitrión: ");
        out.println("1. Juan Camilo ");
        out.println("2. Juanita ");

        menuAnfitrion = Integer.parseInt(in.readLine());

        switch (menuAnfitrion) {
            case (1):
                anfition = new Anfitrion("Juan Camilo", "juancamilo@tierravital.com", "88881111", "Propietario");
                break;
            case (2):
                anfition = new Anfitrion("Juanita", "juanita@tierravital.com", "88882222", "Propietaria");
                break;
        }

        out.println("Cuanto fue el costo total del alquiler de la casa: ");
        pagoReserva = Double.parseDouble(in.readLine());


        int calificacionGeneral;
        int calificacionLipieza;
        int calificacionSeguridad;
        int calificacionAnfitrion;
        String comentarios;

        out.println("------- Nos interesa su opinión -------");

        out.println("Calificación General (1 - 5): ");
        calificacionGeneral = Integer.parseInt(in.readLine());
        out.println("Calificación Limpieza (1 - 5): ");
        calificacionLipieza = Integer.parseInt(in.readLine());
        out.println("Calificación Seguridad (1 - 5): ");
        calificacionSeguridad = Integer.parseInt(in.readLine());
        out.println("Calificación Anfitrión (1 - 5): ");
        calificacionAnfitrion = Integer.parseInt(in.readLine());
        out.println("Comentarios;");
        comentarios = in.readLine();

        service.registrarHuesped( nombre,  nacionalidad,  fechaNacimiento,  correoElectronico,  numerotelefono,  fechaEntrada,  fechaSalida,  casa,  anfition,  pagoReserva,  calificacionGeneral,  calificacionLipieza,  calificacionSeguridad,  calificacionAnfitrion,  comentarios );


    }
    public static void listarPorCasa() throws IOException {
        out.println("¿Cuál casa?");
        out.println("1. Casa #1");
        out.println("2. Casa #2");
        out.println("3. Casa #3");
        int opcion = Integer.parseInt(in.readLine());

        Casa casa = null;

        switch(opcion) {
            case(1): casa = Casa.CASA_1; break;
            case(2): casa = Casa.CASA_2; break;
            case(3): casa = Casa.CASA_3; break;
        }

        for (Huesped h : service.listarHuespedesPorCasa(casa)) {
            out.println(h);
        }
    }
    public static void listarPorMes() throws IOException {
        out.println("Ingrese el mes que desea consultar su ocupación (1-12): ");
        int mes = Integer.parseInt(in.readLine());
        for (Huesped h : service.listarHuespedesPorMes(mes)) {
            out.println(h);
        }
    }
    public static void main(String[] args) throws IOException {

        seleccionarUsuario();
    }
}
