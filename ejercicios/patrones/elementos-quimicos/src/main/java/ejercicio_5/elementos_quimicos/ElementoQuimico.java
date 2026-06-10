package ejercicio_5.elementos_quimicos;

public abstract class ElementoQuimico {

	public abstract String formula();
	public abstract int pesoMolecular();
	public abstract int carga();
	public abstract boolean esMetal();
	public boolean esNoMetal() {
		return !this.esMetal();
	}
	public abstract boolean esValida();
	
}
