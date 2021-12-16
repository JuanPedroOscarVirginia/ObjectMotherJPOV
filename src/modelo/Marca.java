package modelo;

import java.util.Objects;

import utiles.GenerarCadena;

public class Marca {
	
	private String name;

	public Marca() {
		super();
		this.name = GenerarCadena.generarPalabras(7);
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marca other = (Marca) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	
}
