
public class PruebaCuenta {

	public static void main(String[] args) 
	{
		CuentaCorriente cc = new CuentaCorriente(1, 2);
		CuentaAhorro ca = new CuentaAhorro(2, 4);
		
		cc.depositar(2000);
		cc.tranferir(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());		
		
	}
}
