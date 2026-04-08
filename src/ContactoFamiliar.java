public final class ContactoFamiliar extends Contacto{
    private String parentezco;

    public ContactoFamiliar(Persona laPersona, String direccion, String parentezco) {
        super(laPersona, direccion);
        this.parentezco = parentezco;
    }

    public ContactoFamiliar(String nombre, int edad, String cedula, String direccion, String parentezco) {
        super(nombre, edad, cedula, direccion);
        this.parentezco = parentezco;
    }
}
