package modelo;


public class ControBonificacion {
	
	private double suma;
	
	public double registrarSalario(Empleado empleado) 
	{
		this.suma = empleado.getBonificacion()+this.suma;
		System.out.println("Elcalculo de la bonifiacaion: $"+this.suma);
		return this.suma;
	}
	

}
