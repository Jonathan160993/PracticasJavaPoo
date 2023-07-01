
public class PruebaSistemaInterno {
 
	public static void main(String[] args) 
	{
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente2 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente2);
		sistema.autentica(admin);
		
		
		
	}
	
}
