
public class Cliente implements Autenticable {

	private String nombre;
	private String documento;
	private String telefono;

	
	private AutenticacionUtil util;
	
	public Cliente() 
	{
		this.util = new AutenticacionUtil();
	}
	
	
	 public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getDocumento() {
	        return documento;
	    }

	    public void setDocumento(String documento) {
	        this.documento = documento;
	    }

	    public String getTelefono() {
	        return telefono;
	    }
	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

}
