import java.util.LinkedList;

public class Agenda {
    private static LinkedList<ElementoAgenda> listaElementos;

    public Agenda() {
        this.listaElementos = new LinkedList<>();
    }

    public LinkedList<ElementoAgenda> getListaElementos() {
        return listaElementos;
    }

    public void agregarElemento(ElementoAgenda newElemento){
        this.listaElementos.addFirst(newElemento);
    }

    public void imprimirContactos() {
        for (ElementoAgenda e:this.listaElementos) {
            if (e instanceof Contacto)
                System.out.println(e);
        }
    }

    public void imprimirEventos(){
        for (int i = 0; i < this.listaElementos.size(); i++) {
            if (this.listaElementos.get(i) instanceof Evento)
                System.out.println(this.listaElementos.get(i));
        }
    }
    @Override
    public String toString() {
        StringBuffer cadena = new StringBuffer();
        cadena.append("Agenda{ ")
                .append("listaElementos=\n");

        for (ElementoAgenda e: listaElementos) {
            cadena.append(e.toString())
            .append("\n<><><><><><><><><><><><><><>\n");
        }
        cadena.append('}');
        return cadena.toString();
    }
}
