package ejercicio_4_.ImagenesSatelitales;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta implements Componente{
	 List<Componente> topografias = new ArrayList();
	 
	 public double determinarTopografia() {
		 double composicion = topografias
				 .stream()
				 .mapToDouble(s -> s.determinarTopografia())
				 .sum();
		 return composicion / 4;
	 }
	 public boolean compararComposicion(Componente componente) {
		 if (componente instanceof TopografiaMixta) {
			    TopografiaMixta otra = (TopografiaMixta) componente;
			    return topografias.equals(otra.topografias);
			}
		 if (this.determinarTopografia() == componente.determinarTopografia()) {
			 return true;
		 }
			return false;
	 }
	 public void añadirTopografias(Componente componente) {
		 if (topografias.size() < 4) {
			 topografias.add(componente);
		 }
	 }
}
