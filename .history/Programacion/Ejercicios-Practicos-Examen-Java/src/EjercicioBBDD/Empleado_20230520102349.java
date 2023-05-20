package EjercicioBBDD;

public class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String apellidos;
    private int salario;

    public Empleado(int id, String nombre, String apellidos, int salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
        this.id = id;
    }

    // Implementaremos los métodos necesarios (getters y setters)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "=======================================\n" +
                "Empleado: \n" +
                "ID Empleado: " + this.getId() + "\n" +
                "Nombre: " + this.getNombre() + "\n" +
                "Apellidos: " + this.getApellidos() + "\n" +
                "Salario: " + this.getSalario() +
                "\n=======================================";
    }
}
