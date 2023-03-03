package inheritance;

public class CarDetails {

    public static void main(String[] args) {
        CarOwner c1=new CarOwner("BMW", "Automatic", "Tony Stark", 21);
        CarOwner c2=new CarOwner("Jaguar", "Automatic", "Peter Parker", 21);
        System.out.println(c1);
        System.out.println(c2);
    }

}
