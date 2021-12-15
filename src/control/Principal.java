package control;

import modelo.Bateria;
import modelo.Pantalla;

public class Principal {

	public static void main(String[] args) {
		ObjectMother objectMother = new ObjectMother();
		Pantalla pantalla = objectMother.generarPantalla();
		Bateria generarBateria = objectMother.generarBateria(pantalla);
		System.out.println(pantalla.toString());
		System.out.println(generarBateria.toString());
	}

}
