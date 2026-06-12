package ejercicio6.builder_subteway;

public class Director {
	private SandwichBuilder builder;
	
	public Director(SandwichBuilder builder) {
		this.builder = builder;
	}
	public void changeBuilder(SandwichBuilder builder) {
		this.builder = builder;
	}
	public void buildSandwich() {
		this.builder.newSandwich();
		this.builder.addBreadCost();
		this.builder.addDressingCost();
		this.builder.addPrincipalCost();
		this.builder.addAditionalCost();
	}
}
