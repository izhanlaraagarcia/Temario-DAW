package Ejercicio3;

public class Ejercicio3 {

    // Metodo que actualice el salario del empleado?
    public static void actualizarSalario(double sueldo) {
        System.out.println("Ingrese el valor del salario");
        String s = System.console().readLine();
        double nuevoSalario = Double.parseDouble(s);

        System.out.println("Ingrese el numero de horas extras de esta semana");
        String s2 = System.console().readLine();
        int horasExtras = Integer.parseInt(s2);
        double nuevoSalario2 = (nuevoSalario * horasExtras) + nuevoSalario;

        System.out.println("El pago extra es de " + nuevoSalario2);

        // double totalExtra = nuevoSalario2 + salarioPorHora();

    }

    public static void main(String[] args) {
        // Creamos los empleados
        Empleado empleado1 = new Empleado("Manolo", "Directivo", 15, 40);
        Empleado empleado2 = new Empleado("Juan", "Secretario", 10, 30);
        Empleado empleado3 = new Empleado("Pedro", "Administrativo", 8, 20);

        System.out.println("El salario de " + empleado1 + " es un total de " + empleado1.salarioPorHora());
        System.out.println("El salario de " + empleado2 + " es un total de " + empleado2.salarioPorHora());
        System.out.println("El salario de " + empleado3 + " es un total de " + empleado3.salarioPorHora());

        System.out.println("Actualizar sueldo Empleado 1");
        actualizarSalario(empleado1.salarioPorHora());
        System.out.println("Actualizar sueldo Empleado 2");
        actualizarSalario(empleado2.salarioPorHora());
        System.out.println("Actualizar sueldo Empleado 3");
        actualizarSalario(empleado3.salarioPorHora());
    }
}
