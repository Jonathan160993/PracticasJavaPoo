package prueba;

public class PruebaCuenta {

	public static void main(String[] args) 
	{
		modelo.CuentaCorriente cc = new modelo.CuentaCorriente(1, 2);
		modelo.CuentaAhorro ca = new modelo.CuentaAhorro(2, 4);
		
	//	cc.depositar(2000);
		cc.tranferir(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());		
		
	}
}
