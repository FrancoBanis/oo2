package ejercicio6.builder_subteway;

public abstract class SandwichBuilder {
	protected Sandwich sandwich;
	// CAMBIAR.
	public void newSandwich() {
		this.sandwich = new Sandwich();
	};
	abstract void addBreadCost();
	abstract void addDressingCost();
	abstract void addPrincipalCost();
	abstract void addAditionalCost();
	
}
