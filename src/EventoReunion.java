import java.time.LocalDate;
import java.util.Date;

public final class EventoReunion extends Evento{
    private String telefonoEmpresa;

    public EventoReunion(LocalDate fecha, String lugar, String telefonoEmpresa) {
        super(fecha, lugar);
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    @Override
    public void enviarInvitacion(String email[]) {
        for (int i = 0; i < email.length; i++) {
            System.out.println("Invitación a la Reunión a realirse en [" + this.getFecha().toString() + "]  enviada a " + email[i]);
        }
    }

    @Override
    public String toString() {
        return "EventoReunion{" +
                "telefonoEmpresa='" + telefonoEmpresa + '\'' +
                "} " + super.toString();
    }

    @Override
    public String exportJSON() {
        return "";
    }

    @Override
    public String exportXML() {
        return "";
    }
}
