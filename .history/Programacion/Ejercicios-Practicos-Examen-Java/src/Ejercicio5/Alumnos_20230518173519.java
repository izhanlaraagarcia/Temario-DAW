public class Alumnos {
    private String nombreAlumno;
    private String apellidosAlumno;
    private int NIFAlumno;
    private byte edadaAlumno;

    public Alumnos(String nombreAlumno, String apellidosAlumno, int NIFAlumno, byte edadaAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.apellidosAlumno = apellidosAlumno;
        this.NIFAlumno = NIFAlumno;
        this.edadaAlumno = edadaAlumno;

    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }
    public void setNombreAlumno(String nombreAlumno){
        this.nombreAlumno = nombreAlumno;
    
    }
    public String getApellidosAlumno() {
        return apellidosAlumno;
    }
    public int getNIFAlumno() {
        return NIFAlumno;
    }
    public byte getEdadaAlumno() {
        return edadaAlumno;
    }

}
