package cr.ac.ucenfotec.baron.federico.bl.entities;

public class Resena {

    private int calificacionGeneral;
    private int calificacionLimpieza;
    private int calificacionSeguridad;
    private int calificacionAnfitrion;
    private String comentarios;
    public Resena () {
    }
    public Resena(int calificacionGeneral, int calificacionLimpieza, int calificacionSeguridad, int calificacionAnfitrion, String comentarios) {
        this.calificacionGeneral = calificacionGeneral;
        this.calificacionLimpieza = calificacionLimpieza;
        this.calificacionSeguridad = calificacionSeguridad;
        this.calificacionAnfitrion = calificacionAnfitrion;
        this.comentarios = comentarios;
    }
    public int getCalificacionGeneral() {
        return calificacionGeneral;
    }
    public void setCalificacionGeneral(int calificacionGeneral) {
        this.calificacionGeneral = calificacionGeneral;
    }
    public int getCalificacionLimpieza() {
        return calificacionLimpieza;
    }
    public void setCalificacionLimpieza(int calificacionLimpieza) {
        this.calificacionLimpieza = calificacionLimpieza;
    }
    public int getCalificacionSeguridad() {
        return calificacionSeguridad;
    }
    public void setCalificacionSeguridad(int calificacionSeguridad) {
        this.calificacionSeguridad = calificacionSeguridad;
    }
    public int getCalificacionAnfitrion() {
        return calificacionAnfitrion;
    }
    public void setCalificacionAnfitrion(int calificacionAnfitrion) {
        this.calificacionAnfitrion = calificacionAnfitrion;
    }
    public String getComentarios() {
        return comentarios;
    }
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    @Override
    public String toString() {
        return "\n  --- Reseña ---" +
                "\n  General:    " + calificacionGeneral + "/5" +
                "\n  Limpieza:   " + calificacionLimpieza + "/5" +
                "\n  Seguridad:  " + calificacionSeguridad + "/5" +
                "\n  Anfitrión:  " + calificacionAnfitrion + "/5" +
                "\n  Comentario: " + comentarios;
    }
}

