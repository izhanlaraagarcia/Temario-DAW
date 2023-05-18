import java.util.ArrayList;
import java.util.List;

public class Centro {
    public String nombreCentro;
    public Profesor conjuntoProfesores;
    public Alumnos conjuntoAlumnos;
    public List<Profesor> profesor;
    private List<Alumnos> alumnos;
    private List<CiclosFormativos> conjuCiclosFormativos


    public Centro(String nombreCentro, CiclosFormativos conjuCiclosFormativos) {
        this.nombreCentro = nombreCentro;
        this.conjuCiclosFormativos = conjuCiclosFormativos;
        this.profesor = new ArrayList<>();
        this.alumnos = new ArrayList<>();
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

    public CiclosFormativos getConjunFormativos() {
        return conjuCiclosFormativos;
    }
    public void setConjuCiclosFormativos(CiclosFormativos conjuCiclosFormativos){
        this.conjuCiclosFormativos = conjuCiclosFormativos;
    }

    public List<Profesor> getProfesores() {
        return profesor;
    }

    public List<Alumnos> getAlumnos() {
        return alumnos;
    }

    
}
