package modelo;

import java.util.Objects;

public class Procesador {
	
	private String nombre;
	private int nucleos;
	private float velocidad;
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
