package ejercicio;

import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private ArrayList<Salario> salarios;

    // Constructor
    public Empleado(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.salarios = new ArrayList<>();
    }

    // Métodos getters y setters
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Salario> getSalarios() {
        return salarios;
    }

    public void setSalarios(ArrayList<Salario> salarios) {
        this.salarios = salarios;
    }
    // Método para calcular el salario anual
    public double calcularSalarioAnual() {
        double salarioAnual = 0;
        for (Salario salario : salarios) {
            salarioAnual += salario.getCantidad();
        }
        return salarioAnual;
    }
}
