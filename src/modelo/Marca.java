package modelo;

import java.util.Objects;

public class Marca {
	
	private String name;

	public Marca(String name) {
		super();
		this.name = name;
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
		return "Marca [name=" + name + "]";
	}
	
	
}
