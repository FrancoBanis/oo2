package ejercicio6.subteway;

public abstract class Sandwich {

	public double precio() {
		return 
				precioPan() + 
				precioAderezo() + 
				precioPrincipal() + 
				precioAdicional();
	}
	
	protected abstract double precioPan();
	protected abstract double precioAderezo();
	protected abstract double precioPrincipal();
	protected abstract double precioAdicional();
}
