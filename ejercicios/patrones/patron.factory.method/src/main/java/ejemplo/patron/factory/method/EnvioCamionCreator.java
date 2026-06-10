package ejemplo.patron.factory.method;

public class EnvioCamionCreator extends EnvioCreator{

	public Envio crearEnvio() {
		return new EnvioCamion();
	}

}
