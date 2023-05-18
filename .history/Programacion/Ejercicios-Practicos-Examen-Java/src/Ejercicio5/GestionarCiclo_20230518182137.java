import java.util.ArrayList;
import java.util.List;

public class GestionarCiclo {
    private List<CiclosFormativos> ciclos;

    public GestionarCiclo() {
        ciclos = new ArrayList<>();
    }

    // añadir ciclo
    public void addCiclo(CiclosFormativos ciclo) {
        ciclos.add(ciclo);
        System.out.println("Ciclo añadido");
    }

    public void deleteCiclo(CiclosFormativos ciclo) {
        ciclos.remove(ciclo);
        System.out.println("Ciclo borrado");
    }

    public void modificarDatosCiclo(CiclosFormativos cicloActual, CiclosFormativos nuevosCiclos) {
        int index = ciclos.indexOf(cicloActual);
        if (index != -1) {
            ciclos.set(index, nuevosCiclos);
            System.out.println("Ciclo modificado");
        } else {
            System.out.println("No se encontró el Ciclo en la lista");
        }
    }

    public List<CiclosFormativos> getCiclosFormativos() {
        return ciclos;
    }
}
