import java.time.LocalDate;
import java.util.Date;

public abstract class Evento extends ElementoAgenda{
    private LocalDate fecha;
    private String lugar;

    public Evento(LocalDate fecha, String lugar) {
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public abstract void enviarInvitacion(String email[]);

    @Override
    public String toString() {
        return "Evento{" +
                "fecha=" + fecha +
                ", lugar='" + lugar + '\'' +
                "} " + super.toString();
    }
}
