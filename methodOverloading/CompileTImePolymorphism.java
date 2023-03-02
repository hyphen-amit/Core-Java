package methodOverloading;

public class CompileTImePolymorphism {

    public static void main(String[] args) {

        Operations.add(10);
        Operations.add(10,20);
        Operations.add(12.8f, 8);
        Operations.add(10.10f, 28.8f);
        Operations.add(5, 5.5f);
    }

}
