import builders.Builder;

public class CarBuildDirector {

    public void constructUtilityCar(Builder builder) {
        builder.setCarType("Utility");
        builder.setSeats(4);
        builder.setEngine("V6 1.0");
        builder.setTransmission("Manual");
    }

    public void constructPickupTruck(Builder builder) {
        builder.setCarType("Pick-Up Truck");
        builder.setSeats(2);
        builder.setEngine("V6 1.6");
        builder.setTransmission("Semi-Automatic");
        builder.setGPS("GPS");
    }

    public void constructSUV(Builder builder) {
        builder.setCarType("SUV");
        builder.setSeats(7);
        builder.setEngine("V8 2.0");
        builder.setTransmission("Automatic");
        builder.setOnboardComputer("A fancy onboard computer");
        builder.setGPS("GPS");
    }
}