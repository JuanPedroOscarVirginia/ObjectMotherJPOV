package modelo;

import java.util.Objects;

public class Bateria {
	
	private int mwh;
	private int mwhMin = 2500;
	private int mwhMax = 3000;
	private float incrementoMwh = 700f;

	public Bateria(Pantalla pantalla) {
		super();
		this.mwh = calcularBateria(pantalla);
	}

	private int calcularBateria(Pantalla pantalla) {
		float pulgadasSobrantes = pantalla.getSize()-pantalla.getMIN();
		pulgadasSobrantes *= incrementoMwh;
		mwhMin += pulgadasSobrantes;
		mwhMax += pulgadasSobrantes;
		return getMwhRandom(mwhMax, mwhMin);
	}
	
	public int getMwhRandom(int max, int min) {
		int mwh = (int) (Math.random()*(max-min)+min);
		return mwh;
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
		return "Bateria: " + mwh + " mwh]";
	}
	
	
}
