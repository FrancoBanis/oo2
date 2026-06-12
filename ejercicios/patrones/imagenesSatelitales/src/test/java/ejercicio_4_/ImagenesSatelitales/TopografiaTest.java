package ejercicio_4_.ImagenesSatelitales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {

	TopografiaAgua topografiaAgua,topografiaAgua2 ;
	TopografiaTierra topografiaTierra,topografiaTierra2;
	TopografiaMixta topografiaMixta,topografiaMixta2,topografiaMixta3;
	
	@BeforeEach
	void setUp() throws Exception {
		
		topografiaAgua = new TopografiaAgua();
		topografiaAgua2 = new TopografiaAgua();
		topografiaTierra = new TopografiaTierra();
		topografiaTierra2 = new TopografiaTierra();
		topografiaMixta = new TopografiaMixta();
		topografiaMixta2 = new TopografiaMixta();
		topografiaMixta3 = new TopografiaMixta();
		topografiaMixta.añadirTopografias(topografiaAgua);
		topografiaMixta.añadirTopografias(topografiaAgua);
		topografiaMixta.añadirTopografias(topografiaTierra);
		topografiaMixta.añadirTopografias(topografiaAgua);
		topografiaMixta2.añadirTopografias(topografiaMixta);
		topografiaMixta2.añadirTopografias(topografiaAgua);
		topografiaMixta2.añadirTopografias(topografiaTierra);
		topografiaMixta2.añadirTopografias(topografiaAgua);
		topografiaMixta3.añadirTopografias(topografiaAgua);
		topografiaMixta3.añadirTopografias(topografiaAgua);
		topografiaMixta3.añadirTopografias(topografiaAgua);
		topografiaMixta3.añadirTopografias(topografiaAgua);
	}
	@Test
	public void testCompararComposicionAguaAgua() {
		assertEquals(true,topografiaAgua.compararComposicion(topografiaAgua2));
	}
	@Test
	public void testCompararComposicionAguaTierra() {
		assertEquals(false,topografiaTierra.compararComposicion(topografiaAgua));
	}
	@Test
	public void testCompararTopografiaMixta() {
		assertEquals(0.75,topografiaMixta.determinarTopografia());
	}
	@Test
	public void testCompararTopografiaMixta2() {
		assertEquals(0.6875,topografiaMixta2.determinarTopografia());
	}
	@Test
	public void testCompararTopografiasMixtas() {
		assertEquals(false,topografiaMixta.compararComposicion(topografiaMixta2));
	}
	@Test
	public void testCompararTopografiasMixtas2() {
		assertEquals(false,topografiaMixta.compararComposicion(topografiaAgua));
	}
	@Test
	public void testCompararTopografiasMixtas3() {
		assertEquals(true,topografiaMixta3.compararComposicion(topografiaAgua));
	}
}
