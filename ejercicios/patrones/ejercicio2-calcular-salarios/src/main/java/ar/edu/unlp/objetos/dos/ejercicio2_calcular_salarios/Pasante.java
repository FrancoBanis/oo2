package ar.edu.unlp.objetos.dos.ejercicio2_calcular_salarios;

public class Pasante extends AbstractTemplate{
	private int examenes;
	
	public Pasante(int examenes) {
		this.examenes = examenes;
	}
	@Override
	protected double adicionales() {
		return 2000.0*examenes;
	}
}
