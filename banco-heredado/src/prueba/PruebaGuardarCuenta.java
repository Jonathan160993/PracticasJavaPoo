package prueba;
import modelo.Cuenta;
import modelo.CuentaCorriente;
import modelo.GuardaCuentas; 

public class PruebaGuardarCuenta {

	
	public static void main(String[] args) {
		
		GuardaCuentas guardarCuenta = new GuardaCuentas();
		Cuenta cc = new CuentaCorriente(11, 33);
		guardarCuenta.AdicionarCuenta(cc);
		Cuenta cc1 = new CuentaCorriente(12, 34);
		guardarCuenta.AdicionarCuenta(cc1);
		
		System.out.println(guardarCuenta.obtener(0));
		System.out.println(guardarCuenta.obtener(1));
	}
}
