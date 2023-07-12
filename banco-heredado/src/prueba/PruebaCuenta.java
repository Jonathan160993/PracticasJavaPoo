package prueba;
import modelo.*;
public class PruebaCuenta {

	public static void main(String[] args) 
	{
		
		Object [] referencias = new Object[5];
		
		CuentaCorriente cc = new CuentaCorriente(1, 2);
		CuentaAhorro ca = new CuentaAhorro(5, 3);
		
	//	cc.depositar(2000);
		cc.tranferir(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());		
		
	}
}
