import builders.CarBuilder;
import builders.CarManualBuilder;
import model.Car;
import model.CarManual;

public class Main {

    public static void main(String[] args) {
        CarBuildDirector director = new CarBuildDirector();

        // Construct an utility car
        CarBuilder builder = new CarBuilder();        
        director.constructUtilityCar(builder);
        Car car = builder.build();
        System.out.println("\nCar built:\n---------------\n" + car.getCarType());

        // Construct a car manual for an SUV
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSUV(manualBuilder);
        CarManual suvManual = manualBuilder.build();
        System.out.println("\nCar manual built:\n---------------\n" + suvManual.print());
        
        // Construct another car manual using the same builder
        director.constructPickupTruck(manualBuilder);
        CarManual pickupManual = manualBuilder.build();
        System.out.println("\nCar manual built:\n---------------\n" + pickupManual.print());
    }
    
}