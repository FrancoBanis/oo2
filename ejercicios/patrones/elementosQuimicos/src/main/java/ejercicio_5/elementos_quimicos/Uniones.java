package ejercicio_5.elementos_quimicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Uniones extends ElementoQuimico{

	List<ElementoQuimico> uniones;
	
	
	public Uniones() {
		uniones = new ArrayList();
	}
	public void agregarElemento(ElementoQuimico elementoQuimico) {
		uniones.add(elementoQuimico);
		if (!this.esValida()) {
			uniones.remove(elementoQuimico);
		}
	}
	public int pesoMolecular() {
		return uniones.stream().mapToInt(e -> e.pesoMolecular()).sum();
	}
	public int carga () {
		return uniones.stream().mapToInt(e -> e.carga()).sum();
	}
	public boolean esValida() {
	    boolean elementosValidos = uniones.stream()
	        .allMatch(e -> e.esValida());
	    long contador = uniones.stream()
	        .filter(e -> e.esMetal())
	        .count();
	    
	    return elementosValidos && contador < 2;
	}
	public boolean esMetal() {
		return false;
	}
	public String formula() {
		StringBuilder resultado = new StringBuilder();
		Map<String, Long> conteo = 
				uniones.stream()
				.collect(
						Collectors.groupingByConcurrent(
								e -> e.formula(), 
								Collectors.counting()
						));
		conteo.forEach((simbolo,cantidad) -> {
			resultado.append(simbolo);
			if (cantidad > 1) {
				resultado.append(cantidad);
			}
		});
		return resultado.toString();
	}
}
