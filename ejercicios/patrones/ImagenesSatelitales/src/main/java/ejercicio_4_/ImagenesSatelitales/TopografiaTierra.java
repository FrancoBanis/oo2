package ejercicio_4_.ImagenesSatelitales;

public class TopografiaTierra implements Componente{
	private int proporcion = 0;
	
	public TopografiaTierra() {
		
	}
	public double determinarTopografia() {
		return proporcion ;
	}
	public boolean equals(Componente componente) {
		return componente instanceof TopografiaTierra;
	}
	public boolean compararComposicion (Componente componente) {
		return this.equals(componente);
	}
}
