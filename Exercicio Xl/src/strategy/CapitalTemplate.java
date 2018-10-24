package strategy;

public abstract class CapitalTemplate {
	
	public abstract double capital(double valor);
	
	public double duration (double valor) {
		return valor;
	}
	
	protected double riskFactorFor(double valor) {
		return valor;
		
	}

}
