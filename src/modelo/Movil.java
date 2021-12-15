package modelo;

import java.util.Objects;

public class Movil {
	
	private Marca marca;
	private Modelo modelo;
	private Pantalla pantalla;
	private Ram ram;
	private Procesador procesador;
	private Antutu antutu;
	private Bateria bateria;
	private float Precio;
	
	public Movil(Marca marca, Modelo modelo, Pantalla pantalla, Ram ram, Procesador procesador, Antutu antutu,
			Bateria bateria, float precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.pantalla = pantalla;
		this.ram = ram;
		this.procesador = procesador;
		this.antutu = antutu;
		this.bateria = bateria;
		Precio = precio;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Antutu getAntutu() {
		return antutu;
	}

	public void setAntutu(Antutu antutu) {
		this.antutu = antutu;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float precio) {
		Precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Precio, antutu, bateria, marca, modelo, pantalla, procesador, ram);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movil other = (Movil) obj;
		return Float.floatToIntBits(Precio) == Float.floatToIntBits(other.Precio)
				&& Objects.equals(antutu, other.antutu) && Objects.equals(bateria, other.bateria)
				&& Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(pantalla, other.pantalla) && Objects.equals(procesador, other.procesador)
				&& Objects.equals(ram, other.ram);
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", pantalla=" + pantalla + ", ram=" + ram
				+ ", procesador=" + procesador + ", antutu=" + antutu + ", bateria=" + bateria + ", Precio=" + Precio
				+ "]";
	}
	
	
}
