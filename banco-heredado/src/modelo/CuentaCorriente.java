package modelo;


public class CuentaCorriente extends Cuenta {

	public CuentaCorriente (int agencia, int numero) 
	{
		super(agencia, numero);
		
	}
	
	
//-------//sobreescritura de metodos ya existentes//---------
	@Override
	public boolean retirar(double monto) 
	{
		double comision= 0.2;
		return super.retirar(monto + comision);
	}
}
