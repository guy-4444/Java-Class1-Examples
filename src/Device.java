public class Device {

    public enum TYPE {
        SMARTPHONE,
        TABLET,
        LAPTOP,
        PC,
        SMARTWATCH,
        OTHER,
    }

    private TYPE type;
    private String manufacturer;
    private String model;
    private int year;
    private double price;
    private double screenSize;

    public static final int SMARTWATCH = 4;

    public Device(TYPE type, String manufacturer, String model, int year, double price) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
