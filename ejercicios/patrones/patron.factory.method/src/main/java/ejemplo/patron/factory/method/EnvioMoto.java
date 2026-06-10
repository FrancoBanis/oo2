package ejemplo.patron.factory.method;

public class EnvioMoto implements Envio{

	@Override
	public String enviarPaquete() {
		return "Enviando por moto...";
	}
}
