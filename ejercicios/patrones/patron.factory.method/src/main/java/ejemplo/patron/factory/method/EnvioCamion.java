package ejemplo.patron.factory.method;

public class EnvioCamion implements Envio{

	@Override
	public String enviarPaquete() {
		return "Enviando por camion...";
	}
}
