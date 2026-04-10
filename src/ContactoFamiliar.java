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

    @Override
    public String exportJSON() {
        return "{\n" +
                "\t\"nombre\":\"" + super.getLaPersona().getNombre() + "\",\n" +
                "\t\"edad\":\"" + super.getLaPersona().getEdad() + "\",\n" +
                "\t\"cedula\":\"" + super.getLaPersona().getCedula() + "\",\n" +
                "\t\"direccion\":\"" + super.getDireccion() + "\",\n" +
                "\t\"parentezco\":\"" + this.parentezco + "\"\n" +
                "}";
    }

    @Override
    public String exportXML() {
        return "<contactoFamiliar>\n" +
                "\t<nombre>" + super.getLaPersona().getNombre() + "</nombre>\n" +
                "\t<edad>" + super.getLaPersona().getEdad() + "</edad>\n" +
                "\t<cedula>" + super.getLaPersona().getCedula() + "</cedula>\n" +
                "\t<direccion>" + super.getDireccion() + "</direccion>\n" +
                "\t<parentezco>" + this.parentezco + "</parentezco>\n" +
                "</contactoFamiliar>";
    }
}
