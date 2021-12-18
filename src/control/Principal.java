package control;

import java.util.HashSet;
import java.util.Set;

import modelo.Marca;
import modelo.Modelo;
import modelo.Movil;

public class Principal {

	public static void main(String[] args) {
		ObjectMother objectMother = new ObjectMother();
		for (int i = 0; i < 20; i++) {
			System.out.println(objectMother.generarMovil().toString());
		}
		
//		Set<Movil> listaMoviles = new HashSet<>();
//		listaMoviles.add(new Movil(new Marca("Hola"), new Modelo("Hola")));
//		listaMoviles.add(new Movil(new Marca("Hola"), new Modelo("Hola")));
//		
//		listaMoviles.forEach((a) ->{System.out.println(a.toString());});
		
	}

}
