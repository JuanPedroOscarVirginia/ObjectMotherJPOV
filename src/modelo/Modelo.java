package modelo;

import java.util.Objects;

import utiles.GenerarCadena;

public class Modelo {
	
	private String nombre;

	public Modelo() {
		super();
		this.nombre = GenerarCadena.generarModelo(7);
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelo other = (Modelo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return this.nombre;
	}
	
	

}
