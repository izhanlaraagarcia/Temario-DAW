import java.util.ArrayList;
import java.util.List;

public class GestorAlumnos {
    private List<Profesor> profesores;

    public GestorAlumnos() {
        profesores = new ArrayList<>();
    }

    public void addProfesor(Profesor profesor) {
        profesores.add(profesor);
        System.out.println("Profesor añadido");
    }

    public void deleteProfesor(Profesor profesor) {
        profesores.remove(profesor);
        System.out.println("Profesor borrado");
    }

    public void modificarDatosProfesor(Profesor profesorActual, Profesor nuevoProfesor) {
        int index = profesores.indexOf(profesorActual);
        if (index != -1) {
            profesores.set(index, nuevoProfesor);
            System.out.println("Profesor modificado");
        } else {
            System.out.println("No se encontró el profesor en la lista");
        }
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }
}
