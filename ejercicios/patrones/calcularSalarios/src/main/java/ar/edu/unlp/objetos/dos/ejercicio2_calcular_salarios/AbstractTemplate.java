package ar.edu.unlp.objetos.dos.ejercicio2_calcular_salarios;

public class AbstractTemplate {

	public double sueldo() {
		return (sueldoBasico() + adicionales()) - descuento();
	}
	protected double sueldoBasico() {
		return 20000.0;
	};
	protected double adicionales() {
		return 2000.0;
	}
	protected double descuentoSueldoBasico() {
		return 0.13*sueldoBasico();
	}
	protected double descuentoSueldoAdicional() {
		return 0.05*adicionales();
	}
	protected double descuento() {
		return descuentoSueldoBasico() + descuentoSueldoAdicional() ;
	}
}
