package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class JacksonExporter implements Exporter{
	private ObjectMapper objectMapper = new ObjectMapper(); 
	
	
	
	@Override
	public String exportar(List<Socio> socios) {
		try {
			return objectMapper.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			return "Hubo un error en el procesamiento del json";
		}
	}	
}

