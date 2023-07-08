package prueba;

public class PruebaControlBonificacion {

	public static void main (String[] args) 
	{
		modelo.Empleado pedro = new modelo.Contador();
		pedro.setSalario(15000);
		
		modelo.Gerente carlos = new modelo.Gerente();
		carlos.setSalario(25000);
		
		modelo.ControBonificacion controlBonificacion = new modelo.ControBonificacion();
		
		controlBonificacion.registrarSalario(pedro);
		controlBonificacion.registrarSalario(carlos);
	}
}
