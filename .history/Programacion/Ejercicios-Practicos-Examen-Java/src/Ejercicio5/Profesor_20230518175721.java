import java.util.ArrayList;
import java.util.List;

public class Profesor {
    // Un profesor debe contemplar: nombre, apellidos, nif y titulación
    private String nombreProfesor;
    private String apellidosProfesor;
    private int NIFProfesor;
    private String titulacionProfesor;
    private ArrayList<Profesor> profesores; // Lista de profesores

    public Profesor(String nombreProfesor, String apellidosProfesor, int NIFProfesor, String tiulacionProfesor) {
        this.nombreProfesor = nombreProfesor;
        this.apellidosProfesor = apellidosProfesor;
        this.NIFProfesor = NIFProfesor;
        this.titulacionProfesor = titulacionProfesor;
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
        return titulacionProfesor;
    }

    public void setTiulacion(String tiulacion) {
        this.titulacionProfesor = tiulacion;
    }

    // Metodos
    // - Añadir un profesor, borrar un profesor y modificar todos sus datos?
    // Añadir profesor
    public void addProfesor(Profesor profesor) {
        profesores.add(profesor);
        System.out.println(profesores);
        System.out.println("Profesor añadido");

    }

    // Borrar profesor
    public void deleteProfesor(Profesor profesor) {
        profesores.remove(profesor);
        System.out.println(profesores);
        System.out.println("Profesor borrado");
    }

    // Modificar los datos del profesor
    public void modificarDatosProfesor(Profesor profesor) {
        int index = profesores.indexOf(this);
        if (index != -1) {
            profesores.set(NIFProfesor, profesor);
            System.out.println(profesores);
            System.out.println("Profesor modificado");

        } else {
            System.out.println("No se encontro el profesor mencionado: ");
        }

    }

}
