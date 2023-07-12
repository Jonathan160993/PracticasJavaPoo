package prueba;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.CuentaCorriente;
import modelo.Cuenta;
public class PruebaArrayList {
	
		
	public static void main(String[] args) 
	{
		//con los signos de <> forzamos a que se acepte un solo tipo de objeto
		ArrayList<Cuenta> lista = new ArrayList();
		Cuenta cc = new CuentaCorriente(55, 43);
		Cuenta cc2 = new CuentaCorriente(5, 75);
		lista.add(cc);
		lista.add(cc2);//agregamos con arraylist y utilizamos el metodo add
		
		
		Cuenta obtenerCuenta = (Cuenta)lista.get(0);
		System.out.println(obtenerCuenta);
		Cuenta obtenerCuenta1 = (Cuenta)lista.get(1);
		System.out.println(obtenerCuenta1);
		
		System.out.println("por indice");
		for (int i = 0; i< lista.size(); i++) 
		{
			System.out.println(lista.get(i));
		}
		
		System.out.println("prueba por cuenta");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
			
		}
		
		
		
		
		
	}

}
