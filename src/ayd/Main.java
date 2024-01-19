package ayd;

public class Main {
        public static void main(String[] args) {
            // Crear instancia de EmpleadoAsalariado
            EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan", 2000.0);

            // Mostrar información detallada del EmpleadoAsalariado
            System.out.println("Empleado Asalariado:");
            System.out.println("Nombre: " + empleadoAsalariado.getNombre());
            System.out.println("Salario Base: $" + empleadoAsalariado.getSalarioBase());
            System.out.println("Salario Total: $" + empleadoAsalariado.calcularSalario());
            System.out.println();

            // Crear instancia de EmpleadoPorHora
            EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Maria", 15.0, 50, 10.0);

            // Mostrar información detallada del EmpleadoPorHora
            System.out.println("Empleado Por Hora:");
            System.out.println("Nombre: " + empleadoPorHora.getNombre());
            System.out.println("Salario Base: $" + empleadoPorHora.getSalarioBase());
            System.out.println("Horas Trabajadas: " + empleadoPorHora.getHorasTrabajadas());
            System.out.println("Salario Total: $" + empleadoPorHora.calcularSalario());
        }
    }