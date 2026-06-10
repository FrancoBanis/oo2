package ejercicio6.subteway;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SandwichCreatorTest {

	SandwichCreator clásico, vegetariano, vegano, sinTacc;
	
	@BeforeEach
	void setUp() throws Exception {
		clásico = new ClásicoCreator();
		vegetariano = new VegetarianoCreator();
		vegano = new VeganoCreator();
		sinTacc = new SinTACCCreator();
	
	}
	
	@Test
	public void testPrecioClasico() {
		assertEquals(500.0,clásico.precio());
	}
	@Test
	public void testPrecioVegetariano() {
		assertEquals(420.0,vegetariano.precio());
	}
	@Test
	public void testPrecioVegano() {
		assertEquals(620.0,vegano.precio());
	}
	@Test
	public void testPrecioSinTacc() {
		assertEquals(618.0,sinTacc.precio());
	}
}
