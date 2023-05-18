import java.util.*;

class Profesor {
    private String nombre;
    private String apellidos;
    private String nif;
    private String titulacion;

    public Profesor(String nombre, String apellidos, String nif, String titulacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.titulacion = titulacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Apellidos: " + apellidos +
                ", NIF: " + nif +
                ", Titulación: " + titulacion;
    }
}

class Alumno {
    private String nombre;
    private String apellidos;
    private String nif;
    private int edad;

    public Alumno(String nombre, String apellidos, String nif, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Apellidos: " + apellidos +
                ", NIF: " + nif +
                ", Edad: " + edad;
    }
}

class CicloFormativo {
    private String codigo;
    private String nombre;

    public CicloFormativo(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                ", Nombre: " + nombre;
    }
}

class CentroDocente {
    private String nombre;
    private Set<Profesor> profesores;
    private Set<Alumno> alumnos;
    private Set<CicloFormativo> ciclos;

    public CentroDocente(String nombre) {
        this.nombre = nombre;
        this.profesores = new HashSet<>();
        this.alumnos = new HashSet<>();
        this.ciclos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Profesor> getProfesores() {
        return profesores;
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void eliminarProfesor(Profesor profesor) {
        profesores.remove(profesor);
    }

    public void modificarDatosProfesor(Profesor profesor, String nuevoNombre, String nuevosApellidos, String nuevoNif, String nuevaTitulacion) {
        profesor.setNombre(nuevoNombre);
        profesor.setApellidos(nuevosApellidos);
        profesor.setNif(nuevoNif);
        profesor.setTitulacion(nuevaTitulacion);
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
    }

    public void modificarDatosAlumno(Alumno alumno, String nuevoNombre, String nuevosApellidos, String nuevoNif, int nuevaEdad) {
        alumno.setNombre(nuevoNombre);
        alumno.setApellidos(nuevosApellidos);
        alumno.setNif(nuevoNif);
        alumno.setEdad(nuevaEdad);
    }

    public Set<CicloFormativo> getCiclos() {
        return ciclos;
    }

    public void agregarCiclo(CicloFormativo ciclo) {
        ciclos.add(ciclo);
    }

    public void eliminarCiclo(CicloFormativo ciclo) {
        ciclos.remove(ciclo);
    }

    public void modificarDatosCiclo(CicloFormativo ciclo, String nuevoCodigo, String nuevoNombre) {
        ciclo.setCodigo(nuevoCodigo);
        ciclo.setNombre(nuevoNombre);
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el nombre del centro docente: ");
            String nombreCentro = scanner.nextLine();
            CentroDocente centroDocente = new CentroDocente(nombreCentro);

            boolean salir = false;

            while (!salir) {
                System.out.println("----- Centro Docente -----");
                System.out.println("1. Agregar Profesor");
                System.out.println("2. Eliminar Profesor");
                System.out.println("3. Modificar datos de un Profesor");
                System.out.println("4. Agregar Alumno");
                System.out.println("5. Eliminar Alumno");
                System.out.println("6. Modificar datos de un Alumno");
                System.out.println("7. Agregar Ciclo Formativo");
                System.out.println("8. Eliminar Ciclo Formativo");
                System.out.println("9. Modificar datos de un Ciclo Formativo");
                System.out.println("10. Mostrar datos del centro docente");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el salto de línea después de leer un número

                switch (opcion) {
                    case 1:
                        System.out.println("--- Agregar Profesor ---");
                        System.out.print("Ingrese el nombre del profesor: ");
                        String nombreProfesor = scanner.nextLine();
                        System.out.print("Ingrese los apellidos del profesor: ");
                        String apellidosProfesor = scanner.nextLine();
                        System.out.print("Ingrese el NIF del profesor: ");
                        String nifProfesor = scanner.nextLine();
                        System.out.print("Ingrese la titulación del profesor: ");
                        String titulacionProfesor = scanner.nextLine();

                        Profesor profesor = new Profesor(nombreProfesor, apellidosProfesor, nifProfesor, titulacionProfesor);
                        centroDocente.agregarProfesor(profesor);
                        System.out.println("Profesor agregado correctamente.");
                        break;
                    case 2:
                        System.out.println("--- Eliminar Profesor ---");
                        System.out.print("Ingrese el NIF del profesor a eliminar: ");
                        String nifEliminarProfesor = scanner.nextLine();
                        Profesor profesorAEliminar = null;
                        for (Profesor p : centroDocente.getProfesores()) {
                            if (p.getNif().equals(nifEliminarProfesor)) {
                                profesorAEliminar = p;
                                break;
                            }
                        }
                        if (profesorAEliminar != null) {
                            centroDocente.eliminarProfesor(profesorAEliminar);
                            System.out.println("Profesor eliminado correctamente.");
                        } else {
                            System.out.println("No se encontró un profesor con el NIF proporcionado.");
                        }
                        break;
                    case 3:
                        System.out.println("--- Modificar datos de un Profesor ---");
                        System.out.print("Ingrese el NIF del profesor a modificar: ");
                        String nifModificarProfesor = scanner.nextLine();
                        Profesor profesorAModificar = null;
                        for (Profesor p : centroDocente.getProfesores()) {
                            if (p.getNif().equals(nifModificarProfesor)) {
                                profesorAModificar = p;
                                break;
                            }
                        }
                        if (profesorAModificar != null) {
                            System.out.print("Ingrese el nuevo nombre del profesor: ");
                            String nuevoNombreProfesor = scanner.nextLine();
                            System.out.print("Ingrese los nuevos apellidos del profesor: ");
                            String nuevosApellidosProfesor = scanner.nextLine();
                            System.out.print("Ingrese el nuevo NIF del profesor: ");
                            String nuevoNifProfesor = scanner.nextLine();
                            System.out.print("Ingrese la nueva titulación del profesor: ");
                            String nuevaTitulacionProfesor = scanner.nextLine();

                            centroDocente.modificarDatosProfesor(profesorAModificar, nuevoNombreProfesor, nuevosApellidosProfesor, nuevoNifProfesor, nuevaTitulacionProfesor);
                            System.out.println("Datos del profesor modificados correctamente.");
                        } else {
                            System.out.println("No se encontró un profesor con el NIF proporcionado.");
                        }
                        break;
                    case 4:
                        System.out.println("--- Agregar Alumno ---");
                        System.out.print("Ingrese el nombre del alumno: ");
                        String nombreAlumno = scanner.nextLine();
                        System.out.print("Ingrese los apellidos del alumno: ");
                        String apellidosAlumno = scanner.nextLine();
                        System.out.print("Ingrese el NIF del alumno: ");
                        String nifAlumno = scanner.nextLine();
                        System.out.print("Ingrese la edad del alumno: ");
                        int edadAlumno = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea después de leer un número

                        if (edadAlumno > 18) {
                            Alumno alumno = new Alumno(nombreAlumno, apellidosAlumno, nifAlumno, edadAlumno);
                            centroDocente.agregarAlumno(alumno);
                            System.out.println("Alumno agregado correctamente.");
                        } else {
                            System.out.println("El alumno debe ser mayor de 18 años para ser admitido en el centro.");
                        }
                        break;
                    case 5:
                        System.out.println("--- Eliminar Alumno ---");
                        System.out.print("Ingrese el NIF del alumno a eliminar: ");
                        String nifEliminarAlumno = scanner.nextLine();
                        Alumno alumnoAEliminar = null;
                        for (Alumno a : centroDocente.getAlumnos()) {
                            if (a.getNif().equals(nifEliminarAlumno)) {
                                alumnoAEliminar = a;
                                break;
                            }
                        }
                        if (alumnoAEliminar != null) {
                            centroDocente.eliminarAlumno(alumnoAEliminar);
                            System.out.println("Alumno eliminado correctamente.");
                        } else {
                            System.out.println("No se encontró un alumno con el NIF proporcionado.");
                        }
                        break;
                    case 6:
                        System.out.println("--- Modificar datos de un Alumno ---");
                        System.out.print("Ingrese el NIF del alumno a modificar: ");
                        String nifModificarAlumno = scanner.nextLine();
                        Alumno alumnoAModificar = null;
                        for (Alumno a : centroDocente.getAlumnos()) {
                            if (a.getNif().equals(nifModificarAlumno)) {
                                alumnoAModificar = a;
                                break;
                            }
                        }
                        if (alumnoAModificar != null) {
                            System.out.print("Ingrese el nuevo nombre del alumno: ");
                            String nuevoNombreAlumno = scanner.nextLine();
                            System.out.print("Ingrese los nuevos apellidos del alumno: ");
                            String nuevosApellidosAlumno = scanner.nextLine();
                            System.out.print("Ingrese el nuevo NIF del alumno: ");
                            String nuevoNifAlumno = scanner.nextLine();
                            System.out.print("Ingrese la nueva edad del alumno: ");
                            int nuevaEdadAlumno = scanner.nextInt();
                            scanner.nextLine(); // Limpiar el salto de línea después de leer un número

                            centroDocente.modificarDatosAlumno(alumnoAModificar, nuevoNombreAlumno, nuevosApellidosAlumno, nuevoNifAlumno, nuevaEdadAlumno);
                            System.out.println("Datos del alumno modificados correctamente.");
                        } else {
                            System.out.println("No se encontró un alumno con el NIF proporcionado.");
                        }
                        break;
                    case 7:
                        System.out.println("--- Agregar Ciclo Formativo ---");
                        System.out.print("Ingrese el código del ciclo formativo: ");
                        String codigoCiclo = scanner.nextLine();
                        System.out.print("Ingrese el nombre del ciclo formativo: ");
                        String nombreCiclo = scanner.nextLine();

                        CicloFormativo ciclo = new CicloFormativo(codigoCiclo, nombreCiclo);
                        centroDocente.agregarCiclo(ciclo);
                        System.out.println("Ciclo formativo agregado correctamente.");
                        break;
                    case 8:
                        System.out.println("--- Eliminar Ciclo Formativo ---");
                        System.out.print("Ingrese el código del ciclo formativo a eliminar: ");
                        String codigoEliminarCiclo = scanner.nextLine();
                        CicloFormativo cicloAEliminar = null;
                        for (CicloFormativo c : centroDocente.getCiclos()) {
                            if (c.getCodigo().equals(codigoEliminarCiclo)) {
                                cicloAEliminar = c;
                                break;
                            }
                        }
                        if (cicloAEliminar != null) {
                            centroDocente.eliminarCiclo(cicloAEliminar);
                            System.out.println("Ciclo formativo eliminado correctamente.");
                        } else {
                            System.out.println("No se encontró un ciclo formativo con el código proporcionado.");
                        }
                        break;
                    case 9:
                        System.out.println("--- Modificar datos de un Ciclo Formativo ---");
                        System.out.print("Ingrese el código del ciclo formativo a modificar: ");
                        String codigoModificarCiclo = scanner.nextLine();
                        CicloFormativo cicloAModificar = null;
                        for (CicloFormativo c : centroDocente.getCiclos()) {
                            if (c.getCodigo().equals(codigoModificarCiclo)) {
                                cicloAModificar = c;
                                break;
                            }
                        }
                        if (cicloAModificar != null) {
                            System.out.print("Ingrese el nuevo código del ciclo formativo: ");
                            String nuevoCodigoCiclo = scanner.nextLine();
                            System.out.print("Ingrese el nuevo nombre del ciclo formativo: ");
                            String nuevoNombreCiclo = scanner.nextLine();

                            centroDocente.modificarDatosCiclo(cicloAModificar, nuevoCodigoCiclo, nuevoNombreCiclo);
                            System.out.println("Datos del ciclo formativo modificados correctamente.");
                        } else {
                            System.out.println("No se encontró un ciclo formativo con el código proporcionado.");
                        }
                        break;
                    case 10:
                        System.out.println("--- Datos del centro docente ---");
                        System.out.println("Nombre del centro docente: " + centroDocente.getNombre());
                        System.out.println("Profesores:");
                        for (Profesor p : centroDocente.getProfesores()) {
                            System.out.println(p.toString());
                        }
                        System.out.println("Alumnos:");
                        for (Alumno a : centroDocente.getAlumnos()) {
                            System.out.println(a.toString());
                        }
                        System.out.println("Ciclos formativos:");
                        for (CicloFormativo c : centroDocente.getCiclos()) {
                            System.out.println(c.toString());
                        }
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }
            }
        }
    }
}
