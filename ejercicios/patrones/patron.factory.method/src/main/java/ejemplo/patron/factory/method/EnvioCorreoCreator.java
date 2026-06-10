package ejemplo.patron.factory.method;

public class EnvioCorreoCreator extends EnvioCreator{

	public Envio crearEnvio() {
		return new EnvioCorreo();
	}
}
