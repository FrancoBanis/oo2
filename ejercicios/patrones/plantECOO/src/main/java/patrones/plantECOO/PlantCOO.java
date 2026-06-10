package patrones.plantECOO;

public class PlantCOO {
	Strategy mecanismo;
	public PlantCOO() {
		mecanismo = new StrategyConcreteTransito();
	}
	public void activarMitigacion() {
		mecanismo.activarMitigacion();
	}
	public void setStrategy (Strategy mecanismo ) {
		this.mecanismo = mecanismo;
	}
}
