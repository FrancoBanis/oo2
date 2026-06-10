package ejercicio6.builder_subteway;
public class Sandwich  {
	private double breadCost;
	private double dressingCost;
	private double principalCost;
	private double aditionalCost;
	
	public double getBreadCost() {
		return breadCost;
	}
	public void setBreadCost(double breadCost) {
		this.breadCost = breadCost;
	}
	public double getDressingCost() {
		return dressingCost;
	}
	public void setDressingCost(double dressingCost) {
		this.dressingCost = dressingCost;
	}
	public double getPrincipalCost() {
		return principalCost;
	}
	public void setPrincipalCost(double principalCost) {
		this.principalCost = principalCost;
	}
	public double getAditionalCost() {
		return aditionalCost;
	}
	public void setAditionalCost(double aditionalCost) {
		this.aditionalCost = aditionalCost;
	}
	public double totalCost() {
		return this.principalCost + this.dressingCost + this.breadCost + this.aditionalCost;
	}
	
	
}
