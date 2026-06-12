package ejercicio6.builder_subteway;

public class VegetarianoBuilder extends SandwichBuilder{

	@Override
	void addBreadCost() {
		sandwich.setBreadCost(120);
		
	}

	@Override
	void addDressingCost() {
		sandwich.setDressingCost(0);
		
	}

	@Override
	void addPrincipalCost() {
		sandwich.setPrincipalCost(200);
		
	}

	@Override
	void addAditionalCost() {
		sandwich.setAditionalCost(100);
		
	}

	
}
