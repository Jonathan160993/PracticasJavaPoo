
public class SistemaInterno {
	
	private String clave="MiClave93";
	
	public boolean autentica( EmpleadoAutenticable gerente)
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
