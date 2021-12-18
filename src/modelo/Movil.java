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
	private float precio;
	
	
	public Movil(MovilBuilder builder) {
		super();
		this.marca = builder.getMarca();
		this.modelo = builder.getModelo();
		this.pantalla = builder.getPantalla();
		this.ram = builder.getRam();
		this.procesador = builder.getProcesador();
		this.antutu = builder.getAntutu();
		this.bateria = builder.getBateria();
		this.precio = builder.getPrecio();
	}

	
	public Movil(Marca marca, Modelo modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
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
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	
	@Override
	public String toString() {
		return "Movil [Marca:" + marca.toString() + ", Modelo:" + modelo.toString() + ", Pantalla:" + pantalla.toString() + ", " + ram.toString()
				+ ", " + procesador.toString() + ", Antutu: " + antutu + ", " + bateria.toString() + ", Precio:" + precio
				+ "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
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
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}
	
	
}
