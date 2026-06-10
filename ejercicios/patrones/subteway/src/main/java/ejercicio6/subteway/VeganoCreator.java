package ejercicio6.subteway;

public class VeganoCreator extends SandwichCreator{

	public Sandwich crearSandwich() {
		return new Vegano();
	}
}
