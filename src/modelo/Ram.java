package modelo;

import java.util.Objects;

public class Ram {
	
	private int gb;

	public Ram(int gb) {
		super();
		this.gb = gb;
	}

	public int getGb() {
		return gb;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ram other = (Ram) obj;
		return gb == other.gb;
	}

	@Override
	public String toString() {
		return "Ram [gb=" + gb + "]";
	}
	
	
}
