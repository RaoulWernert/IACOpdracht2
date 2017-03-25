package nl.hu.iac.service;

import java.util.ArrayList;
import java.util.List;

public class CalculationService {
    private List<Car> cars;

    public CalculationService() {
        cars = new ArrayList<>();
        cars.add(new Car(1, 0.5f));
        cars.add(new Car(2, 0.7f));
        cars.add(new Car(3, 0.3f));
    }

    private Car getCarById(int id) {
        for (Car track : cars) {
            if (track.getId() == id) {
                return track;
            }
        }
        return null;
    }

    public String Calculate(String type, String price) {
		float cost = Float.parseFloat(price);
		Car car = getCarById(Integer.parseInt(type));
		if(car == null){
		    return "Cost: 0";
        }
        return "Cost: "+(car.getConsumption() * cost);
	}

	public List<Car> getAll() {
		return cars;
	}
}
