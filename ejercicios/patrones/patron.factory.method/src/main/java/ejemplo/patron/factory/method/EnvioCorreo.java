package ejemplo.patron.factory.method;

public class EnvioCorreo implements Envio {

	@Override
	public String enviarPaquete() {
		return "Enviando por correo...";
	}
}
