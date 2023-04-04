package model;

public class CarManual {
	
    private String carType;
    private final int seats;
    private final String engine;
    private final String transmission;
    private final String onboardComputer;
    private final String gpsNavigator;

    public CarManual(String carType, int seats, String engine, String transmission,
                     String onboardComputer, String gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.onboardComputer = onboardComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Number of seats: " + seats + "\n";
        info += "Engine: " + engine + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.onboardComputer != null) {
            info += "Onboard Computer: Functional" + "\n";
        } else {
            info += "Onboard Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}