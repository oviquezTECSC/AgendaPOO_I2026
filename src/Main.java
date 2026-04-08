import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Agenda laAgenda = new Agenda();
        ContactoFamiliar cf1 = new ContactoFamiliar("Pedro",25,"2-222-222","la casa de mi tia","primo");
        laAgenda.agregarElemento(cf1);
        laAgenda.agregarElemento(new EventoFiesta(LocalDate.of(2026,3,18),"La casa de Juan",15));
        laAgenda.agregarElemento(new ContactoEstudio("Juan",27,"7-777-777","Limón","POO"));
        laAgenda.agregarElemento(
                new ContactoFamiliar(
                        new Persona("Maria",30,"1-111-111"),
                        "direccion de Maria",
                        "madre"));

        laAgenda.imprimirContactos();
        laAgenda.imprimirEventos();

        int x = 10;
        char c = 'a';
        x=c;
        c=(char)x;

        ((Contacto)laAgenda.getListaElementos().get(2)).
        ((Evento)laAgenda.getListaElementos().get(2)).enviarInvitacion(new String[]{"uno@correo.com","dos@correo.com"});

        Agenda otraAgenda = new Agenda();
        otraAgenda.agregarElemento(new EventoReunion(LocalDate.now(),"Sala de Eventos X","2460-2222"));
        System.out.println(otraAgenda);
        System.out.println(laAgenda);
    }
}