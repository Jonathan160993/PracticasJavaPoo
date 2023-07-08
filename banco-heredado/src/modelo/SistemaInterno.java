package modelo;


public class SistemaInterno {
	
	private String clave="MiClave93";
	
	public boolean autentica( Autenticable gerente)
	{
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		
		
		if (puedeIniciarSesion) 
		{
			System.out.println("Sesion iniciada");
			return true;
		}else {
			System.out.println("Error de autenticacion");
			return false;
		}
		
	}
	
	

}
