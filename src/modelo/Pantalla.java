package modelo;

import java.util.Objects;

public class Pantalla {
	
	private float size;

	public Pantalla(float size) {
		super();
		this.size = size;
	}

	public float getSize() {
		return size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(size);
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
		return "Pantalla [size=" + size + "]";
	}
	
	

}
