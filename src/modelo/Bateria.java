package modelo;

import java.util.Objects;

public class Bateria {
	
	private int mwh;

	public Bateria(int mwh) {
		super();
		this.mwh = mwh;
	}

	public int getMwh() {
		return mwh;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mwh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bateria other = (Bateria) obj;
		return mwh == other.mwh;
	}

	@Override
	public String toString() {
		return "Bateria [mwh=" + mwh + "]";
	}
	
	
}
