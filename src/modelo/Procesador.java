package modelo;

import java.util.Objects;

public class Procesador {
	
	private String nombre;
	private int nucleos;
	private float velocidad;
	
	private final float MIN_VELOCIDAD= 1.3f;//1.3 ghz
	private final float MAX_VELOCIDAD= 3f;//3ghz
	private final int MIN_NUCLEOS=1;
	private final int MAX_NUCLEOS=8;
	
	public Procesador(String nombre, int nucleos, float velocidad) {
		super();
		this.nombre = nombre;
		this.nucleos = nucleos;
		this.velocidad = velocidad;
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
