package modelo;



public class Contador extends Empleado {

	@Override
	public double getBonificacion() {
		System.out.println("Llamando metodo del Contador");
		return 200;
	}
}
