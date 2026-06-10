package ar.edu.unlp.objetos.dos.ejercicio2_calcular_salarios;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasanteTest {
	Pasante james, guido;
	@BeforeEach
	void setUp() throws Exception {
		james = new Pasante(2);
		guido = new Pasante(0);
	}
	
	@Test
	public void testSueldoConExamenes() {
		double supuestoSueldo = 20000.0 + (4000.0) - ((20000.0*0.13)+(4000.0*0.05));
		assertEquals(james.sueldo(),supuestoSueldo);
	}
	@Test
	public void testSueldosSinExamenes() {
		double supuestoSueldo = (20000.0 + (0.0)) - ((20000.0*0.13)+(0.0));
		assertEquals(guido.sueldo(),supuestoSueldo);
	}
	
}
