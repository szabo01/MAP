package strategy;

public class CapitalTemplateAdvisedLine extends CapitalTemplate {

	@Override
	public double capital(double valor) {

		return valor * duration(valor) * riskFactorFor(valor);
	}

}
