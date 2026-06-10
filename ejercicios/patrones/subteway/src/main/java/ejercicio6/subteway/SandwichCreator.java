package ejercicio6.subteway;

public abstract class SandwichCreator {
	abstract Sandwich crearSandwich();
	
	public double precio() {
		Sandwich sandwich = crearSandwich();
		return sandwich.precio();
	}
}
