import java.util.ArrayList;
import java.util.List;

public class GestorAlumnos {
    private List<Alumnos> alumnos;

    public GestorAlumnos() {
        alumnos = new ArrayList<>();
    }

    public void addAlumno(Alumnos alumno) {
        // comprobaremos que es mayor de edad
        if(alumno.edadAlumno() >= 18){
            alumnos.add(alumno);
            System.out.println("Alumno añadido");
        }else{
            System.out.println("El alumno no es mayor de edad y no podemos añadirlo");
        }
    }

    public void deleteAlumno(Alumnos alumno) {
        alumnos.remove(alumno);
        System.out.println("Alumno borrado");
    }

    public void modificarDatosAlumnos(Alumnos alumnoActual, Alumnos nuevoAlumnos) {
        int index = alumnos.indexOf(alumnoActual);
        if (index != -1) {
            alumnos.set(index, nuevoAlumnos);
            System.out.println("Alumno modificado");
        } else {
            System.out.println("No se encontró el Alumno en la lista");
        }
    }

    public List<Alumnos> getAlumnos() {
        return alumnos;
    }
}
