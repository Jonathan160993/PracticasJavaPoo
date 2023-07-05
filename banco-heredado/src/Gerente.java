

public class Gerente extends EmpleadoAutenticable implements Autenticable{
	

	public double getBonificacion() 
	{
		System.out.println("Llamando metodo del Gerente");
		return 20000;
		
	}
	

}
