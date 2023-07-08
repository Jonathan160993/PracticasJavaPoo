package modelo;

public class EmpleadoAutenticable extends Empleado {

	   private String clave;
		
		
		public void setClave(String clave)
		{
			this.clave = clave;
		}
		public boolean iniciarSesion(String clave) 
		{
			return clave == "MiClave93";
		}
		@Override
		public double getBonificacion() {
			// TODO Auto-generated method stub
			return 0;
		}
		
}
