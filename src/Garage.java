import java.util.Arrays;

public class Garage {

    private String name;
    private Car[] cars;
    private int size;

    public static void print() {
        System.out.println("dfdfdfd");
    }

    public Garage(String name) {
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
        validateCarsArraySize();

        cars[size] = car;
        size++;
    }

    private void validateCarsArraySize() {
        // validate arr for more room - if no increase the size

        if (size < cars.length) {
            return;
        }

        // double the size
        int newSize = cars.length * 2;
        newSize = Math.max(2, newSize);
        Car[] temp = new Car[newSize];
        for (int i = 0; i < cars.length; i++) {
            temp[i] = cars[i];
        }
        cars = temp;
    }

    public Car getCar(int index) {
        if (!validateIndex(index)) {
            return null;
        }

        return cars[index];
    }

    public void removeCar(int index) {
        if (!validateIndex(index)) {
            return;
        }

        for (int i = index; i < cars.length; i++) {
            cars[i] = cars[i + 1];
        }
        size--;
    }

    private boolean validateIndex(int index) {
        if (index < 0) {
            return false;
        }
        if (index >= size) {
            return false;
        }
        return true;
    }

    public void cloneCar(Car car) {
        // add to cars the copy of the car

//        Car clone = //copy;
//        addCar(car);
    }


    @Override
    public String toString() {
        return "\nname: " + name +
                "\nsize: " + size +
                "\ncars=" + Arrays.toString(cars)
                ;
    }


}
