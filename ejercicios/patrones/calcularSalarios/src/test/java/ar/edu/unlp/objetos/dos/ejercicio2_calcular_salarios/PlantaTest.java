package ar.edu.unlp.objetos.dos.ejercicio2_calcular_salarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlantaTest {
	Planta james,guido;
	@BeforeEach
	void setUp() throws Exception {
		james = new Planta(5,true,2);
		guido = new Planta(0,false,0);
	}
	@Test
	public void testSueldoCompleto() {
		double supuestoSueldo = (50000.0) + (19000.0) - ((50000.0*0.13)+(19000.0*0.05));
		assertEquals(james.sueldo(),supuestoSueldo);
	}
	@Test
	public void testSueldoCompletoSinAdicionales() {
		double supuestoSueldo = ((50000.0) + (0.0)) - ((50000.0*0.13)+(0.0));
		assertEquals(guido.sueldo(),supuestoSueldo);
	}
}
