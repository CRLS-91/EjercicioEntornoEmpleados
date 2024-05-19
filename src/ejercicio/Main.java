package ejercicio;

public class Main {
    public static void main(String[] args) {
        // Crear dos objetos de la clase Empleado
        Empleado empleado1 = new Empleado("Juan", "Pérez", "12345678X");
        Empleado empleado2 = new Empleado("María", "López", "87654321Y");

        // Añadir salarios a los empleados
        empleado1.getSalarios().add(new Salario("Enero", 1500));
        empleado1.getSalarios().add(new Salario("Febrero", 1600));
        empleado1.getSalarios().add(new Salario("Marzo", 1700));

        empleado2.getSalarios().add(new Salario("Enero", 1800));
        empleado2.getSalarios().add(new Salario("Febrero", 1900));
        empleado2.getSalarios().add(new Salario("Marzo", 2000));

        // Mostrar los datos de cada empleado y calcular sus salarios anuales
        System.out.println("Datos del Empleado 1:");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Apellidos: " + empleado1.getApellidos());
        System.out.println("DNI: " + empleado1.getDni());
        System.out.println("Salario Anual: " + empleado1.calcularSalarioAnual());

        System.out.println();

        System.out.println("Datos del Empleado 2:");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Apellidos: " + empleado2.getApellidos());
        System.out.println("DNI: " + empleado2.getDni());
        System.out.println("Salario Anual: " + empleado2.calcularSalarioAnual());
    }
}
