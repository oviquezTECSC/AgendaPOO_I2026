public final class ContactoEstudio extends Contacto{
    private String cursoCompartido;

    public ContactoEstudio(String nombre, int edad, String cedula, String direccion, String cursoCompartido) {
        super(nombre, edad, cedula, direccion);
        this.cursoCompartido = cursoCompartido;
    }

    public String getCursoCompartido() {
        return cursoCompartido;
    }

    public void setCursoCompartido(String cursoCompartido) {
        this.cursoCompartido = cursoCompartido;
    }

    @Override
    public String toString() {
        return "ContactoEstudio{" +
                "cursoCompartido='" + cursoCompartido + '\'' +
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
