package ayd;

public class Empleado {
    private String nombre;
    private double salarioBase;
    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public double calcularSalario(){
        return salarioBase;
    }
    public String getNombre(){
        return nombre;
}
