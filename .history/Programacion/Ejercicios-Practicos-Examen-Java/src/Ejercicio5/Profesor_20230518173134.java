public class Profesor {
    // Un profesor debe contemplar: nombre, apellidos, nif y titulación
    private String nombreProfesor;
    private String apellidosProfesor;
    private int NIFProfesor;
    private String tiulacionProfesor;

    public Profesor(String nombreProfesor, String apellidosProfesor, int NIFProfesor, String tiulacionProfesor){
        this.nombreProfesor = nombreProfesor;
        this.apellidosProfesor = apellidosProfesor;
        this.NIFProfesor = NIFProfesor;
        this.tiulacionProfesor = tiulacionProfesor;
    }
    // aplicamos los getters y seters
    
    public String getNombre() {
        return nombreProfesor;
    }
    public void setNombre(String nombre) {
        this.nombreProfesor = nombre;
    }
    public String getApellidos() {
        return apellidosProfesor;
    }
    public void setApellidos(String apellidos) {
        this.apellidosProfesor = apellidos;
    }
    public int getNIF() {
        return NIFProfesor;
    }
    public void setNIF(int nIF) {
        this.NIFProfesor = nIF;
    }
    public String getTiulacion() {
        return tiulacionProfesor;
    }
    public void setTiulacion(String tiulacion) {
        this.tiulacionProfesor = tiulacion;
    }
}

