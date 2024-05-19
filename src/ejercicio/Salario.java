package ejercicio;

public class Salario {
    private String mes;
    private double cantidad;

    // Constructor
    public Salario(String mes, double cantidad) {
        this.mes = mes;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}

