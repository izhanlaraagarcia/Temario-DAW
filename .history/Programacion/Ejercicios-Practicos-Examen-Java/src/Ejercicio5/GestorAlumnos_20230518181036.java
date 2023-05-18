import java.util.ArrayList;
import java.util.List;

public class GestorAlumnos {
    private List<Alumnos> alumnos;

    public GestorAlumnos() {
        alumnos = new ArrayList<>();
    }

    public void addAlumno(Alumnos alumno) {
        alumnos.add(alumno);
        System.out.println("Profesor añadido");
    }

    public void deleteAlumno(Alumnos alumno) {
        alumnos.remove(alumno);
        System.out.println("Profesor borrado");
    }

    public void modificarDatosAlumnos(Alumnos alumnoActual, Alumnos nuevoAlumnos) {
        int index = alumnos.indexOf(alumnoActual);
        if (index != -1) {
            alumnos.set(index, nuevoAlumnos);
            System.out.println("Profesor modificado");
        } else {
            System.out.println("No se encontró el profesor en la lista");
        }
    }

    public List<Alumnos> getAlumnos() {
        return alumnos;
    }
}
