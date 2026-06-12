package ejercicio6.builder_subteway;

public class ClásicoBuilder extends SandwichBuilder{
	
	@Override
	public void addBreadCost() {
		this.sandwich.setBreadCost(100.0);
		
	}

	@Override
	public void addDressingCost() {
		this.sandwich.setDressingCost(20);
		
	}

	@Override
	public void addPrincipalCost() {
		this.sandwich.setPrincipalCost(300);
		
	}

	@Override
	public void addAditionalCost() {
		this.sandwich.setAditionalCost(80);
		
	}
	
}
