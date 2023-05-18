import java.util.ArrayList;
public class Alumnos {
    private String nombreAlumno;
    private String apellidosAlumno;
    private int NIFAlumno;
    private byte edadaAlumno;
    private ArrayList<Alumnos> alumnos; // Lista de profesores


    public Alumnos(String nombreAlumno, String apellidosAlumno, int NIFAlumno, byte edadaAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.apellidosAlumno = apellidosAlumno;
        this.NIFAlumno = NIFAlumno;
        this.edadaAlumno = edadaAlumno;

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

    public byte getEdadaAlumno() {
        return edadaAlumno;
    }

    public void setEdadaAlumno(byte edadaAlumno) {
        this.edadaAlumno = edadaAlumno;
    }



    // Metodos
    // Añadir alumno al centro si es mayor de 18 años

    public void añadirAlumno(){
        // solicitar edad
        if (edadaAlumno >= 18){
            System.out.println("El alumno se ha añadido al centro");
        }else{
            System.out.println("El alumno no puede entrar al centro");
        }
    }

}
