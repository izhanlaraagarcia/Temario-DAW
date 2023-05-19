package EjercicioBBDD;

public class Empleado  {
    // Atributos
    private int id;
    private String nombre;
    private String apellidos;
    private int salario;

    public Empleado(int id, String nombre, String apellidos, int salario){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
        this.id = id;
    }

    // Implementaremos los metodos necesario (getters y setters)
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
