package modelo;

public class GuardaCuentas {
	
	//Creamos un objeto de tipo array para agregar muchas cuentas
	//utilizando un solo metodo
	
	
	Cuenta [] cuenta = new Cuenta[10];
	int indice = 0;
			 
	
	public void AdicionarCuenta(Cuenta cc) {
		cuenta[indice] = cc;
		indice++;
	}
	
	public Cuenta obtener (int indice)
	{
		return cuenta[indice];
	}
	
	
	

}
