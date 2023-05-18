public class Profesor {
    // Un profesor debe contemplar: nombre, apellidos, nif y titulación
    private String nombreProfesor;
    private String apellidosProfesor;
    private int NIFProfesor;
    private String titulacionProfesor;

    public Profesor(String nombreProfesor, String apellidosProfesor, int NIFProfesor, String tiulacionProfesor) {
        this.nombreProfesor = nombreProfesor;
        this.apellidosProfesor = apellidosProfesor;
        this.NIFProfesor = NIFProfesor;
        this.titulacionProfesor = titulacionProfesor;
    }
    // aplicamos los getters y seters

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombre) {
        this.nombreProfesor = nombre;
    }

    public String getApellidosProfesor() {
        return apellidosProfesor;
    }

    public void setApellidosProfesor(String apellidos) {
        this.apellidosProfesor = apellidos;
    }

    public int getNIFProfesor() {
        return NIFProfesor;
    }

    public void setNIFprofesor(int nIF) {
        this.NIFProfesor = nIF;
    }

    public String getTiulacionProfesor() {
        return titulacionProfesor;
    }

    public void setTiulacionProfesor(String tiulacion) {
        this.titulacionProfesor = tiulacion;
    }

}
