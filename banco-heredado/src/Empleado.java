
public class Empleado {

	private String nombre;
	private String identificador;
	private double salario;
	private int tipo;
	
	
	public Empleado() {
		
	}
	
//----------------Getters y Setters-----------------------------------------------------------------	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

//---------------------Metodo pata Calcular bonificacion-------------------------------------
	public double getBonificacion() {
		if (this.tipo == 0) {
			return this.salario * 0.1;
		} else if(this.tipo == 1){
			return this.salario;
		}else {
			
			return 0;
		}
		
		
	}
	
	
	
}