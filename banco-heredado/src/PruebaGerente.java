
public class PruebaGerente {
   
	public static void main(String[] args) 
   {
	// Gerente gerente = new Gerente();
	 //gerente.setSalario(10000);
	 //System.out.println("Tu bonificacion por tu puesto es de: $"+gerente.getBonificacion());
		Empleado gerente = new Empleado();
		gerente.setSalario(10000);
		gerente.setTipo(1);
		
		System.out.println("Tu bonificacion por tu puesto es de: $"+gerente.getBonificacion());
   }
}
