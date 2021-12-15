package control;

import modelo.Bateria;
import modelo.Pantalla;

public class ObjectMother {

	
	public Pantalla generarPantalla(){
		return new Pantalla();
	}
	
	public Bateria generarBateria(Pantalla pantalla){
		return new Bateria(pantalla);
	}
}
