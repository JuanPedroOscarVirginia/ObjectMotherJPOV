package modelo;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public class Procesador {
	
	private String nombre;
	private int nucleos;
	private float velocidad;
	
	private float minVelocidad= 0.9f;//1.3 ghz
	private float maxVelocidad= 1.4f;//3ghz
	private final float INCREMENTO = 0.5f;
	private final int MIN_NUCLEOS=2;
	private final int MAX_NUCLEOS=8;
	
	public Procesador(String nombre, int nucleos, float velocidad) {
		super();
		this.nombre = nombre;
		this.nucleos = generarNucleos();
		this.velocidad = velocidad;
	}
	
	public int generarNucleos(){
		Random r = new Random();
		List<Integer> listaNucleos = r.ints(MIN_NUCLEOS,MAX_NUCLEOS+1).limit(30).distinct().boxed().collect(Collectors.toList());
		listaNucleos.removeIf((n)-> (n%2 !=0));
	
		return listaNucleos.get(r.nextInt(listaNucleos.size()));
	}
	
	public float generarVelocidad() {
		int nucleos = (this.nucleos - MIN_NUCLEOS)/2;
		float suma = nucleos * this.INCREMENTO;
		minVelocidad += suma;
		maxVelocidad += suma;
		return getGhzRandom(maxVelocidad, minVelocidad);
	}
	
	public int getGhzRandom(int max, int min) {
		int mwh = (int) (Math.random()*(max-min)+min);
		return mwh;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getNucleos() {
		return nucleos;
	}
	public float getVelocidad() {
		return velocidad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, nucleos, velocidad);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Procesador other = (Procesador) obj;
		return Objects.equals(nombre, other.nombre) && nucleos == other.nucleos
				&& Float.floatToIntBits(velocidad) == Float.floatToIntBits(other.velocidad);
	}
	@Override
	public String toString() {
		return "Procesador [nombre=" + nombre + ", nucleos=" + nucleos + ", velocidad=" + velocidad + "]";
	}
	
	
}
