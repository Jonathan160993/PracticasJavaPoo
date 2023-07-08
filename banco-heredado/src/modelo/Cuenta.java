package modelo;


public abstract class  Cuenta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total=0;
	
	public Cuenta (int agencia, int numero)
	{
		
		if (agencia<=0) {
			System.out.println("No se permite 0");
			this.agencia=1;
			this.numero= numero;
		} else {
			this.agencia= agencia;
			this.numero= numero;
		}
		total++;
		System.out.println("Se va creando "+ total +" cuenta");
	}
//---------------------Metodo Depositar-----------------------------------------	
	void depositar(double valor){
	    this.saldo = this.saldo + valor;	
	    System.out.println("Tu deposito de: $" +valor+ " pesos fue exitoso :D");
	}
	
//--------------------Metodo saca-----------------------------------------------
	 public boolean saca(double valor) {
	        if(this.saldo >= valor) {
	            this.saldo -= valor;
	            return true;
	        } else {
	            return false;
	        }
	    }
	
//-------------------Metodo Consultar saldo-------------------------------------
	void consultarSaldo() {
		System.out.println("tu saldo actual es: $"+saldo);
	}
	
	
//---------------------Metodo Retirar-------------------------------------------
	public boolean retirar (double monto)
	{
		
		if (this.saldo >= monto) {
		this.saldo = this.saldo - monto;
		return true;
		} 
			System.out.println("Saldo insuficiente");
			return false;
	}
//--------------------Metodo Transferir-----------------------------------------
	
	public boolean tranferir(double monto, Cuenta cuenta)
	{
		
		if (this.saldo >= monto) {
			this.retirar(monto);
			cuenta.saldo = cuenta.saldo + monto;
			System.out.println("Transferencia Exitosa");
			return true;
		} 
			System.out.println("No se pudo realizar tu operacion");
			return false; 
	}
	
//------------------Metodo ObtenerSaldo /Get ------------------------------------
	
	public double getSaldo() 
	{
		return this.saldo;
	}
	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}
	
	public void  setAgencia(int agencia)
	{
		if (agencia > 0 ) {	
		this.agencia = agencia; 
		}
	}
	
	public double getAgencia()
	{
		return this.agencia;
	}
}
