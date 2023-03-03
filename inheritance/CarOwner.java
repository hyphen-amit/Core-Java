package inheritance;

public class CarOwner extends Car{

    private String ownerName;
    private int ownerAge;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getOwnerAge() {
        return ownerAge;
    }

    public void setOwnerAge(int ownerAge) {
        this.ownerAge = ownerAge;
    }

    public CarOwner(String brand, String gearType, String ownerName, int ownerAge) {
        super(brand, gearType);
        this.ownerName = ownerName;
        this.ownerAge = ownerAge;
    }

    @Override
    public String toString() {
        return  super.toString() + "CarOwner{" +
                "ownerName='" + ownerName + '\'' +
                ", ownerAge=" + ownerAge +
                "} ";
    }

    public CarOwner() {
        super();
    }

}
