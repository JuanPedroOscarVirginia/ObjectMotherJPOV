package modelo;

import java.util.Objects;

public class Antutu {
	
	private int puntuacion;
	private Procesador procesador;
	private Ram ram;
	public Antutu(int puntuacion, Procesador procesador, Ram ram) {
		super();
		this.puntuacion = puntuacion;
		this.procesador = procesador;
		this.ram = ram;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public Procesador getProcesador() {
		return procesador;
	}
	public Ram getRam() {
		return ram;
	}
	@Override
	public int hashCode() {
		return Objects.hash(procesador, puntuacion, ram);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Antutu other = (Antutu) obj;
		return Objects.equals(procesador, other.procesador) && puntuacion == other.puntuacion
				&& Objects.equals(ram, other.ram);
	}
	@Override
	public String toString() {
		return "Antutu [puntuacion=" + puntuacion + ", procesador=" + procesador + ", ram=" + ram + "]";
	}
	
	
}
