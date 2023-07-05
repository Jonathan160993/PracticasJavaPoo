public class Administrador extends Empleado implements Autenticable {

	private AutenticacionUtil util;
	
	public Administrador()
	{
		this.setUtil(new AutenticacionUtil());
	}

	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	public AutenticacionUtil getUtil() {
		return util;
	}

	public void setUtil(AutenticacionUtil util) {
		this.util = util;
	}
	

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

}
