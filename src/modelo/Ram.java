package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ram {
	
	private int gb;
	private final int MIN_GB=2;
	private final int MAX_GB=16;

	
	public Ram() {
		super();
		this.gb = generarRam();
	}

	public int getGb() {
		return gb;
	}
	
	public int generarRam(){
		Random r = new Random();
		List<Integer> listaRam = r.ints(MIN_GB,MAX_GB+1).limit(30).distinct().boxed().collect(Collectors.toList());
		listaRam.removeIf((n)-> (n%2 !=0));
	
		return listaRam.get(r.nextInt(listaRam.size()));
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
		return "Ram: " + gb + " gb]";
	}
	
	
}
