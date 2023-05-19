package EjercicioBBDD;

public class Empleado {
    
    // Atributos
    private String nombre;
    private int edad;
    
    // Constructor
    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Métodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Sobreescribir el método toString()
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
    
    // Método main()
    public static void main(String[] args) {
        Empleado persona = new Empleado("Juan", 30);
        System.out.println(persona);
    }
}
