package ar.edu.unlp.objetos.dos.ejercicio2_calcular_salarios;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TemporarioTest {
	Temporario james, guido;
	@BeforeEach
	void setUp() throws Exception {
		james = new Temporario(1,true,3);
		guido = new Temporario(0,false,0);
	}
	@Test
	public void testSueldoCompleto() {
		double supuestoSueldo = (20000.0 + (300)) + (11000.0) - ((20300.0*0.13)+(11000.0*0.05)); 
		assertEquals(james.sueldo(),supuestoSueldo);
	}
	@Test
	public void testSueldoCompletoSinAdicionales() {
		double supuestoSueldo = (20000.0 + 0.0) - ((20000.0*0.13) + 0.0);
		assertEquals(guido.sueldo(),supuestoSueldo);
	}
}
