package prueba;

public class PruebaSistemaInterno {
 
	public static void main(String[] args) 
	{
		modelo.SistemaInterno sistema = new modelo.SistemaInterno();
		modelo.Gerente gerente2 = new modelo.Gerente();
		modelo.Administrador admin = new modelo.Administrador();
		
		sistema.autentica(gerente2);
		sistema.autentica(admin);
		
		
		
	}
	
}
