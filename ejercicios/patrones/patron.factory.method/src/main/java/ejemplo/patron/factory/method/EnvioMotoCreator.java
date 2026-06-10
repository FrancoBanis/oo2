package ejemplo.patron.factory.method;

public class EnvioMotoCreator extends EnvioCreator{

	public Envio crearEnvio() {
		return new EnvioMoto();
	}
}
