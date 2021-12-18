package control;

import java.util.HashSet;
import java.util.Set;

import modelo.Marca;
import modelo.Modelo;
import modelo.Movil;

public class Principal {
	static int contador=1;

	public static void main(String[] args) {
		
		ObjectMother objectMother = new ObjectMother();
		Set<Movil> listaMoviles = new HashSet<>();
		
		for (int i = 0; i < 500; i++) {
			listaMoviles.add(objectMother.generarMovil());
		}
		
		listaMoviles.forEach((a)->{System.out.println((contador++) +" "+a.toString());});
		
		
	}

}
