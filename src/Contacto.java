public class Contacto extends ElementoAgenda{
    private Persona laPersona;
    private String direccion;

    public Contacto(Persona laPersona, String direccion) {
        this.laPersona = laPersona;
        this.direccion = direccion;
    }

    public Contacto(String nombre, int edad, String cedula, String direccion){
        this.laPersona = new Persona(nombre,edad,cedula);
        this.direccion = direccion;
    }

    public Persona getLaPersona() {
        return laPersona;
    }

    public void setLaPersona(Persona laPersona) {
        this.laPersona = laPersona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "laPersona=" + laPersona +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
