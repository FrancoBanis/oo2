package ar.edu.unlp.objetos.dos.ejercicio2_calcular_salarios;

public class Temporario extends Fijo{
	private int horas;

	public Temporario(int horas, boolean casado, int hijos) {
		super(casado,hijos);
		this.horas = horas;
	}
	 @Override
	 protected double sueldoBasico() {
		 return 20000.0 + (horas*300);
	 }

	 
}
