package ejercicio_5.elementos_quimicos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElementosQuimicosTest {

	Cloro cloro;
	Calcio calcio;
	Hidrogeno hidrogeno;
	Oxigeno oxigeno;
	Sodio sodio;
	Uniones uniones,uniones2;
	@BeforeEach
	void setUp() throws Exception {
		cloro = new Cloro();
		calcio = new Calcio();
		hidrogeno = new Hidrogeno();
		oxigeno = new Oxigeno();
		sodio = new Sodio();
		uniones = new Uniones();
		uniones2 = new Uniones();
		uniones.agregarElemento(hidrogeno);
		uniones.agregarElemento(hidrogeno);
		uniones.agregarElemento(oxigeno);
		uniones2.agregarElemento(calcio);
		uniones2.agregarElemento(calcio);
	}
	@Test
	public void testFormula() {
		assertEquals("H2O",uniones.formula());
	}
	@Test
	public void testCarga() {
		assertEquals(0,uniones.carga());
	}
	@Test
	public void testPeso() {
		assertEquals(18,uniones.pesoMolecular());
	}
	@Test
	public void testFormula2() {
		assertEquals("Ca",uniones2.formula());
	}
}
