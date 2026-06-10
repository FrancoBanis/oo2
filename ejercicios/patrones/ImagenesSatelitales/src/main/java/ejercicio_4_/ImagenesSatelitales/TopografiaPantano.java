package ejercicio_4_.ImagenesSatelitales;

public class TopografiaPantano implements Componente{
	private double proporcionAgua = 0.7;
	private double proporcionTierra = 0.3;
	
	public double determinarTopografia() {
		return proporcionAgua + proporcionTierra;
	}
	public boolean compararComposicion (Componente componente) {
		return componente instanceof TopografiaPantano;
	}
	
}
