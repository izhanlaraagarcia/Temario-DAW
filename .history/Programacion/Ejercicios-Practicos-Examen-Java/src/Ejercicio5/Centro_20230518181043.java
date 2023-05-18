public class Centro {
    public String nombreCentro;
    public Profesor conjuntoProfesores;
    public Alumnos conjuntoAlumnos;
    public CiclosFormativos conjunFormativos;

    public Centro(String nombreCentro, Profesor conjuntoProfesores, Alumnos conjuntoAlumnos,
            CiclosFormativos conjunFormativos) {
        this.nombreCentro = nombreCentro;
        this.conjuntoProfesores = conjuntoProfesores;
        this.conjuntoAlumnos = conjuntoAlumnos;
        this.conjunFormativos = conjunFormativos;
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
        return conjunFormativos;
    }

}
