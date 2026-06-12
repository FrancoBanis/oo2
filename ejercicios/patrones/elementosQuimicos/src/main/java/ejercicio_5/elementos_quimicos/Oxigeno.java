package ejercicio_5.elementos_quimicos;

public class Oxigeno extends ElementoQuimico{

	public int carga() {
		return -2;
	}
	public int pesoMolecular() {
		return 16;
	}
	public boolean esMetal() {
		return false;
	}
	public String formula() {
		return "O";
	}
	public boolean esValida() {
		return true;
	}
}
