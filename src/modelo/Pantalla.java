package modelo;

import java.util.Objects;

public class Pantalla implements IPrecio{
	
	private float size;
	private final float MIN = 5f;
	private final float MAX = 8f;

	public Pantalla() {
		super();
		this.size = getPulgada();
	}
	
	@Override
	public float calcularPrecio() {
		float incrementoPantalla=10;
		return incrementoPantalla*this.size;
	}

	public float getSize() {
		return size;
	}

	public float getMIN() {
		return MIN;
	}

	@Override
	public int hashCode() {
		return Objects.hash(size);
	}
	
	public float getPulgada() {
		float floor = (float)(Math.random()*(MAX-MIN))+MIN;
		return Math.round(floor * 10) / 10f;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pantalla other = (Pantalla) obj;
		return Float.floatToIntBits(size) == Float.floatToIntBits(other.size);
	}

	@Override
	public String toString() {
		return String.valueOf(getSize());
	}

	
	
	

}
