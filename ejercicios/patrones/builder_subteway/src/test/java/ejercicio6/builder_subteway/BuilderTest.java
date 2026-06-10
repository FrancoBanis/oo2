package ejercicio6.builder_subteway;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuilderTest {
	Sandwich sandwich;
	SandwichBuilder 
		sinTaccBuilder,
		veganoBuilder,
		vegetarianoBuilder,
		clásicoBuilder;
	Director director;
	@BeforeEach
	void setUp() throws Exception {
		sinTaccBuilder = new SinTaccBuilder();
		veganoBuilder = new VeganoBuilder();
		vegetarianoBuilder = new VegetarianoBuilder();
		clásicoBuilder = new ClásicoBuilder();
		director = new Director(clásicoBuilder);
		director.buildSandwich();
	}
	@Test
	public void testPrecioClasico() {
		assertEquals(500.0,clásicoBuilder.sandwich.totalCost());
	}
	@Test
	public void testPrecioVegetariano() {
		director.changeBuilder(vegetarianoBuilder);
		director.buildSandwich();
		assertEquals(420.0,vegetarianoBuilder.sandwich.totalCost());
	}
	@Test
	public void testPrecioVegano() {
		director.changeBuilder(veganoBuilder);
		director.buildSandwich();
		assertEquals(620.0,veganoBuilder.sandwich.totalCost());
	}
	@Test
	public void testPrecioSinTacc() {
		director.changeBuilder(sinTaccBuilder);
		director.buildSandwich();
		assertEquals(618.0,sinTaccBuilder.sandwich.totalCost());
	}
}
