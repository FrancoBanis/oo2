package ejercicio_4_.ImagenesSatelitales;

public class TopografiaAgua implements Componente{

	private int proporcion = 1;
	
	public TopografiaAgua () {
		
	}
	public double determinarTopografia () {
		return proporcion;
	}
	public boolean compararComposicion (Componente componente) {
		return componente instanceof TopografiaAgua;
	}
	public boolean equals(Componente componente) {
		return this.determinarTopografia() == componente.determinarTopografia();
	}
}
