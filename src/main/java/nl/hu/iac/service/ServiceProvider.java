package nl.hu.iac.service;

public class ServiceProvider {
	private static CalculationService trackService = new CalculationService();
	public static CalculationService getService() {
		return trackService;
	}
}