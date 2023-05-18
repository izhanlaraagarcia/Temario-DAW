import java.util.ArrayList;
import java.util.List;

public class GestorAlumnos {
    private List<Profesor> profesores;

    public GestorAlumnos() {
        alumnos = new ArrayList<>();
    }

    public void addAlumno(Profesor profesor) {
        profesores.add(profesor);
        System.out.println("Profesor añadido");
    }

    public void deleteAlumno(Profesor profesor) {
        profesores.remove(profesor);
        System.out.println("Profesor borrado");
    }

    public void modificarDatosAlumnos(Profesor profesorActual, Profesor nuevoProfesor) {
        int index = profesores.indexOf(profesorActual);
        if (index != -1) {
            profesores.set(index, nuevoProfesor);
            System.out.println("Profesor modificado");
        } else {
            System.out.println("No se encontró el profesor en la lista");
        }
    }

    public List<Profesor> getAlumnos() {
        return profesores;
    }
}
