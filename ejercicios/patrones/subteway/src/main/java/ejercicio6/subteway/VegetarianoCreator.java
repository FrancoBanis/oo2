package ejercicio6.subteway;

public class VegetarianoCreator extends SandwichCreator{

	public Sandwich crearSandwich() {
		return new Vegetariano();
	}

}
