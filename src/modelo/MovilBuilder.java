package modelo;

public class MovilBuilder {
	
	private final Marca marca;
	private final Modelo modelo;
	private final Pantalla pantalla;
	private final Ram ram;
	private final Procesador procesador;
	private final Antutu antutu;
	private final Bateria bateria;
	private float precio;
	
	public MovilBuilder(Antutu antutu, float precio) {
		super();
		this.marca = new Marca();
		this.modelo = new Modelo();
		this.pantalla = new Pantalla();
		this.ram = new Ram();
		this.procesador = new Procesador();
		this.antutu = antutu;
		this.bateria = new Bateria(pantalla, procesador,ram);
		this.precio = precio;
	}
	
	public Movil movilBuild() {
		return new Movil(antutu, precio,this);
	}
	

	public Marca getMarca() {
		return marca;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public Ram getRam() {
		return ram;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public Antutu getAntutu() {
		return antutu;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public float getPrecio() {
		return precio;
	}
	
	
	
	
	
	
}
