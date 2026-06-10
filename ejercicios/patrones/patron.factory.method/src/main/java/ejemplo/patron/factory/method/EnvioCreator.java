package ejemplo.patron.factory.method;

public abstract class EnvioCreator {

	// Aca se implementa el Factory Method.
	protected abstract Envio crearEnvio();
	
	// Lógica en comun para todo los tipos de envio.
	public String procesarEnvio() {
		Envio envio = crearEnvio();
		return envio.enviarPaquete();
	}
}
