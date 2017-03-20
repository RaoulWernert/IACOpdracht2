package nl.hu.iac.service;

public class CalculationService {
	public String Calculate(String type, String price) {
		float cost = Float.parseFloat(price);
		switch (type){
			case "1":
				return ""+(cost * 0.5);
			case "2":
				return ""+(cost * 0.7);
		}
		return "0";
	}
}
