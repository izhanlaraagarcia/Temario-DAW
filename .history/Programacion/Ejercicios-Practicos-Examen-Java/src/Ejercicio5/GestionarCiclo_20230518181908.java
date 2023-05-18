import java.util.ArrayList;
import java.util.List;

public class GestionarCiclo {
    private List<CiclosFormativos> ciclos;

    public GestionarCiclo() {
        ciclos = new ArrayList<>();
    }
    public void deleteCiclo(CiclosFormativos ciclos) {
        ciclos.remove(ciclo);
        System.out.println("Alumno borrado");
    }

    public void modificarDatosAlumnos(CiclosFormativos cicloActual, Alumnos nuevosCiclos) {
        int index = ciclos.indexOf(cicloActual);
        if (index != -1) {
            ciclos.set(index, nuevosCiclos);
            System.out.println("Alumno modificado");
        } else {
            System.out.println("No se encontró el Alumno en la lista");
        }
    }

    public List<CiclosFormativos> getCiclosFormativos() {
        return ciclos;
    }
}
