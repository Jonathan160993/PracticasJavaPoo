
public class Gerente extends Empleado{
	
	private String clave;
	
	
	public void setClave(String clave)
	{
		this.clave = clave;
	}
		
	public boolean iniciarSesion(String clave) 
	{
		return clave == "MiClave93";
	}
	public double getBonificacion() 
	{
		System.out.println("Llamando metodo del Gerente");
		return super.getSalario() + this.getSalario();
		
	}
	

}
