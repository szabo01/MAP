package strategy;

public class CapitalTemplateTermLoan extends CapitalTemplate {

	@Override
	public double capital(double valor) {
		return valor * riskFactorFor(valor) * duration(valor);
		
	}
	
	public double duration ( double valor ) {
		return super.duration(valor * 3);
	}

	
	
}
