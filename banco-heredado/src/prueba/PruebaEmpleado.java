package prueba;

public class PruebaEmpleado {

		public static void main(String[] args) {
			
			modelo.Empleado jonathan = new modelo.Contador();
			jonathan.setNombre("Jonathan");
			jonathan.setIdentificador("16091993");
			jonathan.setSalario(20000);
			jonathan.setTipo(0);
			
			System.out.println("Tu sueldo es de: $"+jonathan.getSalario());
			System.out.println("Tu bonificacion por tu puesto es: $"+jonathan.getBonificacion());
			
			
		}
}
