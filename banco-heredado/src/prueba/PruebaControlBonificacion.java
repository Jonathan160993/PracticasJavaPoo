package prueba;
//-----------------------------------------------------------|
//importamos todas las clases e interfaces del paquete modelo|
import modelo.*;//-------------------------------------------|
//-----------------------------------------------------------|


public class PruebaControlBonificacion {

	public static void main (String[] args) 
	{
		Empleado pedro = new Contador();
		pedro.setSalario(15000);
		
		Gerente carlos = new modelo.Gerente();
		carlos.setSalario(25000);
		
		ControBonificacion controlBonificacion = new ControBonificacion();
		controlBonificacion.registrarSalario(pedro);
		controlBonificacion.registrarSalario(carlos);
	}
}
