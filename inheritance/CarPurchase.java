package inheritance;

public class CarPurchase extends CarOwner{

    private String purchaseCity;
    private int purchaseYear;

    public String getPurchaseCity() {
        return purchaseCity;
    }

    public void setPurchaseCity(String purchaseCity) {
        this.purchaseCity = purchaseCity;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    public CarPurchase(String brand, String gearType, String ownerName, int ownerAge, String purchaseCity, int purchaseYear) {
        super(brand, gearType, ownerName, ownerAge);
        this.purchaseCity = purchaseCity;
        this.purchaseYear = purchaseYear;
    }

    public CarPurchase(String purchaseCity, int purchaseYear) {
        this.purchaseCity = purchaseCity;
        this.purchaseYear = purchaseYear;
    }

    @Override
    public String toString() {
        return "CarPurchase{" +
                "purchaseCity='" + purchaseCity + '\'' +
                ", purchaseYear=" + purchaseYear +
                "} " + super.toString();
    }
}
