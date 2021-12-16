package control;

import modelo.Antutu;
import modelo.Movil;

public class ObjectMother {

	
	public Movil generarMovil(){
		return new Movil(new Antutu(), 5f);
	}
	
}
