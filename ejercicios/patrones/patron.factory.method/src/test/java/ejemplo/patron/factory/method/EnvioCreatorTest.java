package ejemplo.patron.factory.method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnvioCreatorTest {

	EnvioCreator correo,moto,camion;
	@BeforeEach
	void setUp() throws Exception {
		correo = new EnvioCorreoCreator();
		moto = new EnvioMotoCreator();
		camion = new EnvioCamionCreator();
	}
	
	@Test
	public void testCorreo() {
		assertEquals("Enviando por correo...",correo.procesarEnvio());
	}
	@Test
	public void testMoto() {
		assertEquals("Enviando por moto...",moto.procesarEnvio());
	}
	@Test
	public void testCamion() {
		assertEquals("Enviando por camion...",camion.procesarEnvio());
	}
}
