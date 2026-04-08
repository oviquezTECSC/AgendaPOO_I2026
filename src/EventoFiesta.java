import java.time.LocalDate;
import java.util.Date;

public final class EventoFiesta extends Evento{
    private int numeroInvitados;

    public EventoFiesta(LocalDate fecha, String lugar, int numeroInvitados) {
        super(fecha, lugar);
        this.numeroInvitados = numeroInvitados;
    }

    public int getNumeroInvitados() {
        return numeroInvitados;
    }

    public void setNumeroInvitados(int numeroInvitados) {
        this.numeroInvitados = numeroInvitados;
    }

    @Override
    public void enviarInvitacion(String email[]) {
        for (int i = 0; i < email.length; i++) {
            System.out.println("Invitación a la Fiesta a realirse en [" + this.getFecha().toString() + "]  enviada a " + email[i]);
        }
    }

    @Override
    public String toString() {
        return "EventoFiesta{" +
                "numeroInvitados=" + numeroInvitados +
                "} " + super.toString();
    }
}
