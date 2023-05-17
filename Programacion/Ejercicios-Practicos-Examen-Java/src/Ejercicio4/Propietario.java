package Ejercicio4;

public class Propietario {
    public String nombre;
    private String apellidos;
    private String direccion;
    private String calle;
    private int numero;
    private String municipio;

    public Propietario(String nombre, String apellidos, String direccion, String calle, int numero, String municipio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.calle = calle;
        this.numero = numero;
        this.municipio = municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMunicipio() {
        return municipio;
    }
}
