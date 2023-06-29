
public class PruebaGerente {
   
	public static void main(String[] args) 
   {
	 Gerente gerente = new Gerente();
	 //gerente.setSalario(10000);
	 //System.out.println("Tu bonificacion por tu puesto es de: $"+gerente.getBonificacion());
	//Empleado gerente = new Empleado();
	
	 
	 if (gerente.iniciarSesion("MiClave98")) {
		 System.out.println("Bienvenido... Sesion iniciada");
		 gerente.setSalario(10000);
		 gerente.setTipo(1);
		 System.out.println("Tu bonificacion por tu puesto es de: $"+gerente.getBonificacion());
	} else {
		System.out.println("Lo sentimos, no tienes acceso al sistema");
	}
	 
   }
}
