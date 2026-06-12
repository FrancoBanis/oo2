package ejercicio6.builder_subteway;

public class SinTaccBuilder extends SandwichBuilder {

	@Override
	void addBreadCost() {
		sandwich.setBreadCost(150);
		
	}

	@Override
	void addDressingCost() {
		sandwich.setDressingCost(18);
		
	}

	@Override
	void addPrincipalCost() {
		sandwich.setPrincipalCost(250);
		
	}

	@Override
	void addAditionalCost() {
		sandwich.setAditionalCost(200);
		
	}
	
}
