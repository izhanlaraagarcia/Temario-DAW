
public class Ejercicio5 {
    public static void main(String[] args) {
        /*
         * Se mostrará en consola todos los datos del centro docente, incluyendo
         * profesores, alumnos y ciclos. Los datos se deberán imprimir a partir del
         * centro docente.
         */

        // Creamos el centro
        Centro centro = new Centro(null, null);

        // creamos los profesores
        Profesor profesor1 = new Profesor("Juan", "Perez", 1234234, "DAM");
        Profesor profesor2 = new Profesor("Pedro", "Gomez", 2342345, "DAW");
        Profesor profesor3 = new Profesor("Maria", "Lopez", 3452345, "ASIR");
        Profesor profesor4 = new Profesor("Luis", "Gutierrez", 4562345, "DAW");

        // creamos los alumnos
        Alumnos alumno1 = new Alumnos("Ana", "Gomez", 1234567, 10);
        Alumnos alumno2 = new Alumnos("Pablo", "Gonzalez", 2345678, 9);
        Alumnos alumno3 = new Alumnos("Laura", "Martinez", 3456789, 18);
        Alumnos alumno4 = new Alumnos("Carlos", "Rodriguez", 4567890, 40);
        Alumnos alumno5 = new Alumnos("Marta", "Gutierrez", 5678901, 50);
        Alumnos alumno6 = new Alumnos("Jorge", "Garcia", 6789012, 60);
        Alumnos alumno7 = new Alumnos("Pedro", "Lopez", 7890123, 70);
        Alumnos alumno8 = new Alumnos("Pedro", "Gonzalez", 8901234, 80);
        Alumnos alumno9 = new Alumnos("Maria", "Martinez", 9012345, 90);
        Alumnos alumno10 = new Alumnos("Luis", "Rodriguez", 9123456, 100);


        // creamos los ciclos
        CiclosFormativos ciclo1 = new CiclosFormativos(1, "DAW");

        // Añadimos los profesores al centro
        centro.getProfesores().add(0, profesor1);
        centro.getProfesores().add(1, profesor2);
        centro.getProfesores().add(2, profesor3);
        centro.getProfesores().add(3, profesor4);
        // Añadimos los alumnos al centro
        centro.getAlumnos().add(0, alumno1);
        centro.getAlumnos().add(1, alumno2);
        centro.getAlumnos().add(2, alumno3);
        centro.getAlumnos().add(3, alumno4);
        centro.getAlumnos().add(4, alumno5);
        centro.getAlumnos().add(5, alumno6);
        centro.getAlumnos().add(6, alumno7);
        centro.getAlumnos().add(7, alumno8);
        centro.getAlumnos().add(8, alumno9);
        centro.getAlumnos().add(9, alumno10);

        // Añadimos los ciclos al centro
        centro.agregarCiclo(ciclo1);

        // Mostraremos por pantalla todos los datos del centro

        // Mostramos la informacion del centro
        System.out.println("Centro:");
        System.out.println("Nombre del centro: " + centro.getNombreCentro());
        System.out.println("Ciclos: " + centro.getConjunFormativos());
        System.out.println("-------------------------");

        // Mostramos la inforamcion de los profesores
        System.out.println("Profesores:");
        for (Profesor profesor : centro.getProfesores()) {
            System.out.println("Nombre: " + profesor.getNombreProfesor());
            System.out.println("Apellidos: " + profesor.getApellidosProfesor());
            System.out.println("NIF: " + profesor.getNIFProfesor());
            System.out.println("Titulacion: " + profesor.getTiulacionProfesor());
        }
        System.out.println("-------------------------");

        // Mostremos la informacion de los alumnos por pantalla
        System.out.println("Alumnos:");
        for (Alumnos alumno : centro.getAlumnos()) {
            // Nombre del alumno
            System.out.println("Nombre del alumno: " + alumno.getNombreAlumno());
            System.out.println("Apellidos: " + alumno.getApellidosAlumno());
            System.out.println("NIF: " + alumno.getNIFAlumno());
            System.out.println("-------------------------");
        }
        // Mostar la informacion del ciclo por pantalla:
        System.out.println("Ciclos:");
        for(CiclosFormativos ciclos : centro.getCiclos()){
            System.out.println("Codigo: " + ciclos.getCodigo());
            System.out.println("Nombre del ciclo: " + ciclos.getNombreCiclo());
            System.out.println("-------------------");
        }
    }
}
