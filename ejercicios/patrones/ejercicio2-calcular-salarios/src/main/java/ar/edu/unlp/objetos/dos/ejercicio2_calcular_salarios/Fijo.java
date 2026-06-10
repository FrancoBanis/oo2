package ar.edu.unlp.objetos.dos.ejercicio2_calcular_salarios;

public class Fijo extends AbstractTemplate{
	protected boolean casado;
	protected int hijos;
	
	protected Fijo(boolean casado, int hijos) {
		this.casado = casado;
		this.hijos = hijos;
	}
	protected double adicionalSiCasado() {
		 if (casado) { return 5000.0; };
		 return 0.0;
	 }
	protected double adicionalesHijos() {
		 return hijos*2000;
	 }
	protected double calcularAdicionalesFijos() {
		 return adicionalSiCasado() + adicionalesHijos();
	 }
	@Override
	protected double adicionales() {	 
		 return calcularAdicionalesFijos();
	 }
}
