
public class PruebaControlBonificacion {

	public static void main (String[] args) 
	{
		Empleado pedro = new Empleado();
		pedro.setSalario(15000);
		
		Gerente carlos = new Gerente();
		carlos.setSalario(25000);
		
		ControBonificacion controlBonificacion = new ControBonificacion();
		
		controlBonificacion.registrarSalario(pedro);
		controlBonificacion.registrarSalario(carlos);
	}
}
