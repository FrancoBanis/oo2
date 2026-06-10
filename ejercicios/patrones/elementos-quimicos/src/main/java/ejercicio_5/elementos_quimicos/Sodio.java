package ejercicio_5.elementos_quimicos;

public class Sodio extends ElementoQuimico{

	public String formula() {
		return "Na";
	}
	public int carga() {
		return +1;
	}
	public int pesoMolecular() {
		return 23;
	}
	public boolean esMetal() {
		return true;
	}
	public boolean esValida() {
		return true;
	}
}
