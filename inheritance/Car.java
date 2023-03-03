package inheritance;

public class Car {

    private String Brand;
    private String gearType;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public Car(String brand, String gearType) {
        this.Brand = brand;
        this.gearType = gearType;
    }

    public Car() {
        super();
    }

    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + Brand + '\'' +
                ", gearType='" + gearType + '\'' +
                '}';
    }
}
