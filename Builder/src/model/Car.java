package model;

public class Car {
	
    private final String carType;
    private final int seats;
    private final String engine;
    private final String transmission;
    private final String onboardComputer;
    private final String gpsNavigator;
    private double fuel = 0;

    public Car(String carType, int seats, String engine, String transmission,
    		   String onboardComputer, String gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.onboardComputer = onboardComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getOnboardComputer() {
        return onboardComputer;
    }

    public String getGpsNavigator() {
        return gpsNavigator;
    }
}