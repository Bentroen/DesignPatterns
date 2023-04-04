import devices.Device;
import devices.Radio;
import devices.Television;
import remotes.AdvancedRemote;
import remotes.SimpleRemote;

public class Main {
	
    public static void main(String[] args) {
        testDevice(new Television());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with simple remote:" + "\n");
        SimpleRemote basicRemote = new SimpleRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote:" + "\n");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}