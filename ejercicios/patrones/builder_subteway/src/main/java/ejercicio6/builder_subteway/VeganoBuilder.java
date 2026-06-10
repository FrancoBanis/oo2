package ejercicio6.builder_subteway;

public class VeganoBuilder extends SandwichBuilder{

	@Override
	void addBreadCost() {
		sandwich.setBreadCost(100);
		
	}

	@Override
	void addDressingCost() {
		sandwich.setDressingCost(20);
		
	}

	@Override
	void addPrincipalCost() {
		sandwich.setPrincipalCost(500);
		
	}

	@Override
	void addAditionalCost() {
		sandwich.setAditionalCost(0);
		
	}

}
