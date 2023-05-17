package Ejercicio3;

public class Empleado {

    // le añadiremos los atributos nombre, puesto de trabajo, salario por horas
    public String nombre;
    public String puesto;
    public int salarioPorHora;
    public int horasTrabajadas;

    public Empleado(String nombre, String puesto, int salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto() {
        this.puesto = puesto;
    }

    public int salarioPorHora() {
        return ((salarioPorHora * horasTrabajadas) * 8);
    }

    public void setSalarioPorHora(int salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int horasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas() {
        this.horasTrabajadas = horasTrabajadas;
    }

}
