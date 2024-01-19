package ayd;

  public class EmpleadoPorHora extends Empleado{

    // Atributos adicionales privados
    private int horasTrabajadas;
    private double tarifaPorHora;
    private static final int HORAS_REGULARES = 40;

    public EmpleadoPorHora(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        // Llama al constructor de la clase base (Empleado)
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public double calcularSalario() {
        int horasRegulares = Math.min(horasTrabajadas, HORAS_REGULARES);
        int horasExtras = Math.max(horasTrabajadas - HORAS_REGULARES, 0);
        double salarioTotal = super.calcularSalario() + (horasRegulares * tarifaPorHora) + (horasExtras * 1.5 * tarifaPorHora);
        return salarioTotal;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
}