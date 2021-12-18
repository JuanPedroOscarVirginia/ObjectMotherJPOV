package control;

import modelo.Antutu;
import modelo.Movil;
import modelo.MovilBuilder;

public class ObjectMother {
	
	MovilBuilder movilBuilder;
	
	public Movil generarMovil(){
		movilBuilder = new MovilBuilder(new Antutu(), 2f);
		return movilBuilder.movilBuild();
	}
	
}
