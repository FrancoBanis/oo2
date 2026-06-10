package ejercicio_5.elementos_quimicos;

public class Hidrogeno extends ElementoQuimico{
	
	public int carga() {
		return +1;
	}
	public String formula() {
		return "H";
	}
	public int pesoMolecular() {
		return 1;
	}
	public boolean esMetal() {
		return false;
	}
	public boolean esValida () { 
		return true;
	}
}
