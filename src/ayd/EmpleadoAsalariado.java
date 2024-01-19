package ayd;

/*public class EmpleadoAsalariado extends Empleado{
        private double bonoAnual;

        public EmpleadoAsalariado(String nombre, double salarioBase, double bonoAnual) {
            super(nombre, salarioBase);
            this.bonoAnual = bonoAnual;
        }

    public EmpleadoAsalariado(String juan, double salarioBase) {
        super();
    }

    public double calcularSalario(){
            return super.calcularSalario() + bonoAnual;
        }

        public double getBonoAnual(){
            return bonoAnual;
        }

    public String getSalarioBase() {
            return ;
    }
}*/

public class EmpleadoAsalariado extends Empleado {
    private double bonoAnual;

    public EmpleadoAsalariado(String nombre, double salarioBase, double bonoAnual){
        super(nombre, salarioBase);
        this.bonoAnual = bonoAnual;
    }

    public double calcualarSalario(){
        return super.calcularSalario() + bonoAnual;
    }
    public double getBonoAnual() {
        return bonoAnual;
}
}
