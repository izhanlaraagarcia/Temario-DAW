import java.util.ArrayList;
import java.util.List;

public class Alumnos {
    private String nombreAlumno;
    private String apellidosAlumno;
    private int NIFAlumno;
    private int edadAlumno;
    private List<Alumnos> alumnosList; // Lista de alumnos

    public Alumnos(String nombreAlumno, String apellidosAlumno, int NIFAlumno, int edadAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.apellidosAlumno = apellidosAlumno;
        this.NIFAlumno = NIFAlumno;
        this.edadAlumno = edadAlumno;
        this.alumnosList = new ArrayList<>();
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

    public int getEdadAlumno() {
        return edadAlumno;
    }

    public void setEdadAlumno(int edadAlumno) {
        this.edadAlumno = edadAlumno;
    }

    public List<Alumnos> getAlumnosList() {
        return alumnosList;
    }

    public void setAlumnosList(List<Alumnos> alumnosList) {
        this.alumnosList = alumnosList;
    }
}
