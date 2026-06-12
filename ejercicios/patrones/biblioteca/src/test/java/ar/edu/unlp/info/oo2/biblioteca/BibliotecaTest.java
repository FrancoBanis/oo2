package ar.edu.unlp.info.oo2.biblioteca;
import static org.junit.jupiter.api.Assertions.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
public class BibliotecaTest {
	private Biblioteca biblioteca = new Biblioteca();
	
	private Biblioteca otraBiblioteca = new Biblioteca();
	
	private String jsonBiblioteca1;
	private String jsonBiblioteca2;
	private String jsonBiblioteca3;
	// JSONObject
	private JSONArray jsonExporter = new JSONArray();
	private JSONObject jsonExporterObject = new JSONObject();
	private JSONObjectExporter jsonObjectExporter = new JSONObjectExporter();
	// Voorhees
	private VoorheesExporter exporterVoorhees = new VoorheesExporter();
	// Jackson
	private JacksonExporter jacksonExporter = new JacksonExporter();
	private ObjectMapper objectMapper = new ObjectMapper(); 
	
	
	private List<Socio> socios = new ArrayList();
	
	private Socio AryaSocio = new Socio("Arya Stark","needle@stark.com","5234-5");
	
	@BeforeEach
	void setUp() throws Exception {
	biblioteca.agregarSocio(AryaSocio);
	socios.add(AryaSocio);
	
	jsonBiblioteca1 = exporterVoorhees.exportar(socios);
	
	jsonExporterObject.put("nombre", AryaSocio.getNombre());
	jsonExporterObject.put("email", AryaSocio.getEmail());
	jsonExporterObject.put("legajo", AryaSocio.getLegajo());
	jsonExporter.add(jsonExporterObject);
	jsonBiblioteca2 = jsonExporter.toJSONString();
	
	jsonBiblioteca3 = objectMapper.writeValueAsString(socios);
	}
	
	@Test
	public void exportarTestVoorhees() {
		assertEquals(biblioteca.exportarSocios(),jsonBiblioteca1);
	}
	@Test
	public void exportarTestJSONSimple() {
		biblioteca.setExporter(jsonObjectExporter);
		assertEquals(biblioteca.exportarSocios(),jsonBiblioteca2);
	}
	@Test
	public void exportarTestVacio() {
		assertEquals("[]",otraBiblioteca.exportarSocios());
	}
	@Test
	public void exportarTestJackson() {
		
		biblioteca.setExporter(jacksonExporter);
		assertEquals(biblioteca.exportarSocios(),jsonBiblioteca3);
	}
}