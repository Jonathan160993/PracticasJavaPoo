
public class Gerente {
	
	private String nombre;
	private String documeto;
	private int salario;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumeto() {
		return documeto;
	}
	public void setDocumeto(String documeto) {
		this.documeto = documeto;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public double getBonificacion()
	{
		return this.salario;
	}
	
	
	
	

}
