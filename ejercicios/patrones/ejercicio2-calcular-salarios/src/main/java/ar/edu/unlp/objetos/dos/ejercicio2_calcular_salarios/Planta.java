package ar.edu.unlp.objetos.dos.ejercicio2_calcular_salarios;

public class Planta extends Fijo{
	private int antiguedad;	
	
	public Planta(int antiguedad, boolean casado, int hijos) {
		super(casado,hijos);
		this.antiguedad = antiguedad;
	}
	@Override 
	protected double sueldoBasico(){
		return 50000.0;
	}
	private double calcularAdicionalAntiguedad() {
		return antiguedad*2000.0;
	}
	@Override
	protected double adicionales() {
		return calcularAdicionalesFijos() + calcularAdicionalAntiguedad();
	}
}
