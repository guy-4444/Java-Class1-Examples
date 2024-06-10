import java.util.Random;

public class Exercise6 {


    public static void start() {

        Device[] devices = new Device[10];

        devices[0] = new Device(Device.TYPE.SMARTPHONE, "Apple", "iPhone 15", 2023, 1000);
        devices[1] = new Device(Device.TYPE.SMARTWATCH, "Apple", "Watch Ultra", 2023, 800);
        devices[2] = new Device(Device.TYPE.TABLET, "Samsung", "Tab A9+", 2022, 300);
        devices[2] = new Device(Device.TYPE.OTHER, "Samsung", "Tab A9+", 2022, 300);

        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getType() == Device.TYPE.TABLET) {

            }
        }
    }


}














