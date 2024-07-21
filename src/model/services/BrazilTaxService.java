package model.services;

public class BrazilTaxService extends TaxService {
	
	@Override
	public Double tax (double basicPayment) {
		if(basicPayment <= 100.0) {
			return basicPayment * 0.2;
		}
		else {
			return basicPayment * 0.15;
		}
	}
}
