import java.util.ArrayList;
import java.util.List;

public class Centro {
    public String nombreCentro;
    public Profesor conjuntoProfesores;
    public Alumnos conjuntoAlumnos;
    public List<Profesor> profesor;
    private List<Alumnos> alumnos;
    private List<CiclosFormativos> ciclos;

    public Centro(String nombreCentro, List<CiclosFormativos> ciclos) {
        this.nombreCentro = nombreCentro;
        this.profesor = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.ciclos = new ArrayList<>();
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public Profesor getConjuntoProfesores() {
        return conjuntoProfesores;
    }

    public void setConjuntoProfesores(Profesor conjuntoProfesores) {
        this.conjuntoProfesores = conjuntoProfesores;
    }

    public Alumnos getConjuntoAlumnos() {
        return conjuntoAlumnos;
    }

    public void setConjuntoAlumnos(Alumnos conjuntoAlumnos) {
        this.conjuntoAlumnos = conjuntoAlumnos;
    }

    public List<Profesor> getProfesores() {
        return profesor;
    }

    public List<Alumnos> getAlumnos() {
        return alumnos;
    }

    public List<CiclosFormativos> getCiclos() {
        return ciclos;
    }

    public void agregarCiclo(CiclosFormativos ciclo) {
        this.ciclos.add(ciclo);
    }

    public void eliminarCiclo(CiclosFormativos ciclo) {
        this.ciclos.remove(ciclo);
    }

    public void modificarCiclo(CiclosFormativos ciclo, String nuevoNombre) {
        ciclo.setNombreCiclo(nuevoNombre);
    }

}
