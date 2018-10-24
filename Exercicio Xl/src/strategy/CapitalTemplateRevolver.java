package strategy;

public class CapitalTemplateRevolver extends CapitalTemplate {

	@Override
	public double capital(double valor) {

		return valor * riskFactorFor(valor) * duration(valor) * capital(valor);
	}

}
