public class Car {

    private String model;
    private int km = 0;
    private String phone;
    private double price;
    private boolean isAutomatic;
    private boolean isRegistered;
    private Date createdAt;

    public Car() { }

    // getters

    public String getModel() {
        return model;
    }

    public int getKm() {
        return km;
    }

    public String getPhone() {
        return phone;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public Date getCreatedAt() {
        return createdAt;
    }


    // setters

    public void setModel(String model) {
        this.model = model;
    }

    public void setKm(int km) {
        if (km >= 0) {
            this.km = km;
        }
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    // toString

    @Override
    public String toString() {
        return "\n  - " + model + " km: " + km + ", " + createdAt.toString();
    }
}
