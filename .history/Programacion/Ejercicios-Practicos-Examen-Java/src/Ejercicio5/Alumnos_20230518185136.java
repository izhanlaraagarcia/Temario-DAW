import java.util.ArrayList;

public class Alumnos {
    private String nombreAlumno;
    private String apellidosAlumno;
    private int NIFAlumno;
    private byte edadAlumno;
    private ArrayList<Alumnos> alumnos; // Lista de alumnos

    public Alumnos(String nombreAlumno, String apellidosAlumno, int NIFAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.apellidosAlumno = apellidosAlumno;
        this.NIFAlumno = NIFAlumno;
        this.edadAlumno = edadAlumno;
        this.alumnos = new ArrayList<>();

    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;

    }

    public String getApellidosAlumno() {
        return apellidosAlumno;
    }

    public void setApellidosAlumno(String apellidosAlumno) {
        this.apellidosAlumno = apellidosAlumno;
    }

    public int getNIFAlumno() {
        return NIFAlumno;
    }

    public void setNIFAlumno(int NIFAlumno) {
        this.NIFAlumno = NIFAlumno;
    }

    public byte edadAlumno() {
        return edadAlumno;
    }

    public byte getEdadAlumno() {
        return edadAlumno;
    }

    public void setEdadAlumno(byte edadAlumno) {
        this.edadAlumno = edadAlumno;
    }
}