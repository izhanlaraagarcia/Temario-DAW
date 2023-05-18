public class Profesor {
    // Un profesor debe contemplar: nombre, apellidos, nif y titulación
    private String nombre;
    private String apellidos;
    private int NIF;
    private String tiulacion;

    public Profesor(String nombre, String apellidos, int NIF, String titulacion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.tiulacion = titulacion;
    }
    // aplicamos los getters y seters
    
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
    public int getNIF() {
        return NIF;
    }
    public void setNIF(int nIF) {
        NIF = nIF;
    }
    public String getTiulacion() {
        return tiulacion;
    }
    public void setTiulacion(String tiulacion) {
        this.tiulacion = tiulacion;
    }
}

