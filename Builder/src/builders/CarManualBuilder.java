package builders;

import model.CarManual;

public class CarManualBuilder implements Builder {
	
    private String type;
    private int seats;
    private String engine;
    private String transmission;
    private String onboardComputer;
    private String gps;

    @Override
    public void setCarType(String type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setOnboardComputer(String onboardComputer) {
        this.onboardComputer = onboardComputer;
    }

    @Override
    public void setGPS(String gps) {
        this.gps = gps;
    }

    public CarManual build() {
        return new CarManual(type, seats, engine, transmission, onboardComputer, gps);
    }
   
}