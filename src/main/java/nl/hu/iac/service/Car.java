package nl.hu.iac.service;

/**
 * Created by Raoul on 3/25/2017.
 */
public class Car {
    private int id;
    private float consumption;

    public Car(int id, float consumption) {
        this.id = id;
        this.consumption = consumption;
    }
    public int getId() {
        return id;
    }
    public float getConsumption() {
        return consumption;
    }
}