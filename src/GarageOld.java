import java.util.Arrays;

public class GarageOld {

    private String name;
    private Car[] cars;
    private int size;


    public GarageOld(String name) {
        setName(name);
        cars = new Car[0];
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    private void setName(String name) {
        if (name != null  &&  !name.equals("")  &&  name.length() > 1) {
            this.name = name;
        } else {
            this.name = "NA";
        }
    }

    public void addCar(Car car) {
        int newSize = cars.length + 1;

        Car[] temp = new Car[newSize];
        for (int i = 0; i < cars.length; i++) {
            temp[i] = cars[i];
        }
        cars = temp;
        cars[newSize - 1] = car;
    }

    public Car getCar(int index) {
        return cars[index];
    }

    public void removeCar(int index) {
        int newSize = cars.length - 1;

        Car[] temp = new Car[newSize];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (i == index) {
                continue;
            }
            temp[j] = cars[i];
            j++;
        }
        cars = temp;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\nsize: " + size +
                "\ncars=" + Arrays.toString(cars)
                ;
    }


}
