import java.util.List;

public class Centro {
    public String nombreCentro;
    public Profesor conjuntoProfesores;
    public Alumnos conjuntoAlumnos;
    public CiclosFormativos conjuCiclosFormativos;
    public List<Profesor> profesor;
    private List<Alumnos> alumnos;


    public Centro(String nombreCentro, String conjunFormativos) {
        this.nombreCentro = nombreCentro;
        this.conjuCiclosFormativos = conjuCiclosFormativos
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

    public List<Alumnos> getAlumnos(){
        return alumnos;
    }

    public List<Profesor> getProfesor(){
        return profesor;
    }

}
